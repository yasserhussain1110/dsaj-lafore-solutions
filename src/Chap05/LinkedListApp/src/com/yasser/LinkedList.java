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

    public void insertFirst(int id, double value) {
        Link newLink = new Link(id, value);
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
        out.print("List (first-->last): ");
        for (Link i = first; i != null; i = i.next) {
            i.display();
            out.print(" ");
        }
        out.println();
    }

    public Link find(int id) {
        for (Link i = first; i != null; i = i.next) {
            if (i.id == id) return i;
        }
        return null;
    }

    private Link findParent (int id) {
        for (Link i = first; i.next != null; i = i.next) {
            if (i.next.id == id) return i;
        }
        return null;
    }

    public Link delete(int id) {
        if (isEmpty()) return null;

        if (first.id == id) {
            Link link = first;
            first = null;
            return link;
        } else if(first.next == null) {
            return null;
        }

        Link parentLink = findParent(id);
        if (parentLink == null) return null;

        Link link = parentLink.next;
        parentLink.next = link.next;
        return link;
    }
}
