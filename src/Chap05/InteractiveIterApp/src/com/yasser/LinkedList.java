package com.yasser;

import static java.lang.System.out;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        if (isEmpty()) return null;
        Link val = first;
        first = first.next;
        return val;
    }

    public void display() {
        for (Link i = first; i != null; i = i.next) {
            i.display();
            out.print(" ");
        }
        out.println();
    }

    public Link find(int value) {
        for (Link i = first; i != null; i = i.next) {
            if (i.value == value) return i;
        }
        return null;
    }

    private Link findParent (int value) {
        for (Link i = first; i.next != null; i = i.next) {
            if (i.next.value == value) return i;
        }
        return null;
    }

    public Link delete(int value) {
        if (isEmpty()) return null;

        if (first.value == value) {
            Link link = first;
            first = null;
            return link;
        } else if(first.next == null) {
            return null;
        }

        Link parentLink = findParent(value);
        if (parentLink == null) return null;

        Link link = parentLink.next;
        parentLink.next = link.next;
        return link;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link link) {
        first = link;
    }
}
