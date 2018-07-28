package com.yasser;

public class Deque {
    private int[] array;
    private int maxSize;
    private int size;
    private int front, rear;

    public Deque(int s) {
        maxSize = s;
        array = new int[s];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void insertLeft(int n) throws Exception {
        if (isFull()) throw new Exception("Deque full");
        rear++;
        if (rear >= array.length) rear = 0;
        array[rear] = n;
        size++;
    }

    public void insertRight(int n) throws Exception {
        if (isFull()) throw new Exception("Deque full");
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front--;
            if (front < 0) front = array.length - 1;
        }
        array[front] = n;
        size++;

    }

    public int removeLeft() throws Exception {
        if (isEmpty()) throw new Exception("Deque empty");
        int n = array[rear];
        rear--;
        if (rear < 0) rear = array.length - 1;
        size--;
        return n;
    }

    public int removeRight() throws Exception {
        if (isEmpty()) throw new Exception("Deque empty");
        int n = array[front];
        front++;
        if (front >= array.length) front = 0;
        size--;
        return n;
    }

    public void display() {
        if (isEmpty()) return;
        if (front > rear) {
            for (int i = front; i < array.length; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void empty () {
        size = 0;
        front = 0;
        rear = -1;
    }
}
