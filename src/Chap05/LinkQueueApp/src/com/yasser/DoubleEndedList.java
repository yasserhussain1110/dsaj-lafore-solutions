package com.yasser;

public class DoubleEndedList {
    private Link first, last;

    public DoubleEndedList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        Link link = new Link(value);
        if (isEmpty()) first = last = link;
        else {
            link.next = first;
            first = link;
        }
    }

    public void insertLast(int value) {
        Link link = new Link(value);
        if (isEmpty()) first = last = link;
        else {
            last.next = link;
            last = link;
        }
    }

    public int deleteFirst() throws Exception {
        if (isEmpty()) throw new Exception("Double Ended List");
        Link link = first;
        first = first.next;
        return link.value;
    }

    public void display() {
        for (Link i = first; i != null; i = i.next) {
            i.display();
        }
    }
}
