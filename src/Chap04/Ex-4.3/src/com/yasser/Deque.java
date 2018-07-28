package com.yasser;

public class Deque {
    int maxSize;
    int[] array;
    int front, rear;

    public Deque(int n) {
        maxSize = n;
        array = new int[n + 1];
        front = 0;
        rear = -1;
    }

    public void insertLeft(int n) throws Exception {
        if (isFull()) throw new Exception("Deque full");
        rear++;
        if (rear > maxSize) rear = 0;
        array[rear] = n;
    }

    public void insertRight(int n) throws Exception {
        if (isFull()) throw new Exception("Deque full");
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front--;
            if (front < 0) front = maxSize;
        }
        array[front] = n;
    }

    public int removeLeft() throws Exception {
        if (isEmpty()) throw new Exception("Deque full");
        int n = array[rear];
        rear--;
        if (rear < 0) rear = maxSize;
        return n;
    }

    public int removeRight() throws Exception {
        if (isEmpty()) throw new Exception("Deque empty");
        int n = array[front];
        front++;
        if (front > maxSize) front = 0;
        return n;
    }

    public void display() {
        if (isEmpty()) return;
        if (front > rear) {
            for (int i = front; i <= maxSize; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            System.out.println();
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int peekLeft() throws Exception {
        if (isEmpty()) throw new Exception("Deque empty");
        return array[rear];
    }

    public int peekRight() throws Exception {
        if (isEmpty()) throw new Exception("Deque empty");
        return array[front];
    }

    public void empty() {
        rear = -1;
        front = 0;
    }

    public boolean isEmpty() {
        return (front == rear + 1) || (front == 0 && rear == maxSize);
    }

    public boolean isFull() {
        return (front == rear + 2) || (front == 0 && rear == maxSize - 1);
    }
}
