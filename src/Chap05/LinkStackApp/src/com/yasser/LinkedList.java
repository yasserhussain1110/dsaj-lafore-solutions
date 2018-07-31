package com.yasser;

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

    public int deleteFirst() throws Exception {
        if (isEmpty()) throw new Exception("Linked List empty");
        int value = first.value;
        first = first.next;
        return value;
    }

    public void display() {
        for (Link i = first; i != null; i = i.next) {
            i.display();
        }
    }
}
