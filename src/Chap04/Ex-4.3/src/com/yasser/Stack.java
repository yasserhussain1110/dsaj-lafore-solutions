package com.yasser;

public class Stack {
    private Deque deque;

    public Stack(int n) {
        deque = new Deque(n);
    }

    public void push(int n) throws Exception {
        deque.insertLeft(n);
    }

    public int pop() throws Exception {
        return deque.removeLeft();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public boolean isFull() {
        return deque.isFull();
    }

    public int peek() throws Exception {
        return deque.peekLeft();
    }
}
