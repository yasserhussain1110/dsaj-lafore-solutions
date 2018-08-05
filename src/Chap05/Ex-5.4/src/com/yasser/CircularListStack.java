package com.yasser;

public class CircularListStack {
    private CircularList list;

    public CircularListStack() {
        list = new CircularList();
    }

    public void push(int value) {
        list.insert(value);
    }

    public int pop() throws Exception {
        return list.delete();
    }

    public boolean isEmpty () {
        return list.isEmpty();
    }
}
