package com.yasser;

import static java.lang.System.out;

public class LinkQueue {
    private DoubleEndedList list;

    public LinkQueue() {
        list = new DoubleEndedList();
    }

    public void insert(int value) {
        list.insertLast(value);
    }

    public int remove() throws Exception {
        return list.deleteFirst();
    }

    public void display() {
        out.print("Queue (front-->rear): ");
        list.display();
        out.println();
    }
}
