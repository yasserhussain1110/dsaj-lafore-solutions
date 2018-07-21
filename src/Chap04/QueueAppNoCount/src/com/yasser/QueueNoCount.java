package com.yasser;

public class QueueNoCount {
    public int[] array;
    int front, rear, lastIndex;

    public QueueNoCount(int maxSize) {
        lastIndex = maxSize;
        array = new int[maxSize + 1];
        rear = -1;
        front = 0;
    }

    public boolean isEmpty() {
        return front == rear + 1 || (front == 0 && rear == lastIndex);
    }

    public boolean isFull() {
        return (front == rear + 2) || (rear - front + 1) == array.length - 1;
    }

    public int peekFront() throws Exception {
        if (isEmpty())
            throw new Exception("Queue empty");
        return array[front];
    }

    public void insert(int n) throws Exception {
        if (isFull())
            throw new Exception("Queue full");
        rear++;
        if (rear > lastIndex) rear = 0;
        array[rear] = n;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue empty");
        int num = array[front];
        front++;
        if (front > lastIndex) front = 0;
        return num;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (front <= rear) {
            return (rear - front) + 1;
        } else {
            return array.length - (front - rear - 1);
        }
    }
}
