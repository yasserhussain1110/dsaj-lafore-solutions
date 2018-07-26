package com.yasser;

public class Queue {
    int nItems;
    int[] array;
    int front, rear;

    public Queue(int maxSize) {
        array = new int[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return array.length == nItems;
    }

    public int peekFront() throws Exception {
        if (isEmpty())
            throw new Exception("Queue empty");
        return array[front];
    }

    public void insert(int n) throws Exception {
        if (isFull())
            throw new Exception("Queue full");
        rear = (rear + 1) % array.length;
        array[rear] = n;
        nItems++;
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
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue empty");
        int num = array[front];
        front = (front + 1) % array.length;
        nItems--;
        return num;
    }
}
