package com.yasser;

public class PriorityQ {
    int[] array;
    int nItems;

    public PriorityQ(int maxSize) {
        array = new int[maxSize];
        nItems = 0;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == array.length;
    }

    public int remove() {
        return array[--nItems];
    }

    public int peekMin() {
        return array[nItems - 1];
    }

    public void insert(int n) {
        int i;
        for (i = nItems - 1; i >= 0; i--) {
            if (array[i] > n) break;
            array[i + 1] = array[i];
        }
        array[i + 1] = n;
        nItems++;
    }
}
