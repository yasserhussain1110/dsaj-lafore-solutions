package com.yasser;

import static java.lang.System.out;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public void insertFirst(int value) {
        Link link = new Link(value);
        if (isEmpty()) {
            first = last = link;
        } else {
            link.next = first;
            first.prev = link;
            first = link;
        }
    }

    public void insertLast(int value) {
        Link link = new Link(value);
        if (isEmpty()) {
            first = last = link;
        } else {
            last.next = link;
            link.prev = last;
            last = link;
        }
    }

    public void displayForward() {
        out.print("List (first-->last): ");
        if (isEmpty()) return;
        for (Link i = first; i != null; i = i.next) {
            out.print(i.value);
            out.print(" ");
        }
        out.println();
    }

    public void displayBackward() {
        out.print("List (last-->first): ");
        if (isEmpty()) return;
        for (Link i = last; i != null; i = i.prev) {
            out.print(i.value);
            out.print(" ");
        }
        out.println();
    }

    public int deleteFirst() throws Exception {
        if (isEmpty()) throw new Exception("List empty");
        int value = first.value;
        first = first.next;
        if (first == null) {
            last = null;
        } else {
            first.prev = null;
        }
        return value;
    }

    public int deleteLast() throws Exception {
        if (isEmpty()) throw new Exception("List empty");
        int value = last.value;
        last = last.prev;
        if (last == null) {
            first = null;
        } else {
            last.next = null;
        }
        return value;
    }

    private Link findKey(int key) {
        for (Link i = first; i != null; i = i.next) {
            if (i.value == key) return i;
        }
        return null;
    }

    public int deleteKey(int key) throws Exception {
        Link link = findKey(key);
        if (link == null) throw new Exception("Key not found");

        int value = link.value;
        if (link.prev == null) {
            // first item
            deleteFirst();
        } else if (link.next == null) {
            // last item
            deleteLast();
        } else {
            link.prev.next = link.next;
            link.next.prev = link.prev;
        }
        return value;
    }

    private void insertNewLinkAfterLink(Link newLink, Link link) {
        if (link.next == null) {
            link.next = newLink;
            newLink.prev = link;
        } else {
            Link nextLink = link.next;

            link.next = newLink;
            newLink.prev = link;

            nextLink.prev = link;
            link.next = nextLink;
        }
    }

    public void insertAfter(int key, int newKey) throws Exception {
        Link link = findKey(key);
        if (link == null) throw new Exception("Key not found");
        insertNewLinkAfterLink(new Link(newKey), link);
    }

    public void insertBefore(int key, int newKey) throws Exception {
        Link link = findKey(key);
        if (link == null) throw new Exception("Key not found");

        if (link.prev == null) {
            insertFirst(newKey);
        } else {
            Link newLink = new Link(newKey);
            insertNewLinkAfterLink(newLink, link.prev);
        }
    }
}
