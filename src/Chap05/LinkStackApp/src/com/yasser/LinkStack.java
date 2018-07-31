package com.yasser;

import static java.lang.System.out;

public class LinkStack {
    private LinkedList linkedList;

    public LinkStack() {
        linkedList = new LinkedList();
    }

    public void push(int value) {
        linkedList.insertFirst(value);
    }

    public int pop() throws Exception {
        return linkedList.deleteFirst();
    }

    public void display() {
        out.print("Stack (top-->bottom): ");
        linkedList.display();
        out.println();
    }
}
