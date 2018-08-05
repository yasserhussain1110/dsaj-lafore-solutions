package com.yasser;

public class Deque {
    private DoublyLinkedList list;

    public Deque() {
        list = new DoublyLinkedList();
    }

    public void insertLeft(int value) {
        list.insertFirst(value);
    }

    public void insertRight(int value) {
        list.insertLast(value);
    }

    public int removeRight() throws Exception {
        return list.deleteLast();
    }

    public int removeLeft() throws Exception {
        return list.deleteFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.displayForward();
    }
}
