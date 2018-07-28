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

    public int remove() throws Exception {
        int minIndex = findMinIndex();
        int minValue = array[minIndex];
        for (int i = minIndex; i < nItems - 1; i++) {
            array[i] = array[i + 1];
        }
        nItems--;
        return minValue;
    }

    private int findMinIndex() throws Exception {
        if (isEmpty()) throw new Exception("Priority Queue empty");

        int minIndex = 0;
        for (int i = 1; i < nItems; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public int peekMin() throws Exception {
        return array[findMinIndex()];
    }

    public void insert(int n) throws Exception {
        if (isFull()) throw new Exception("Priority Queue full");
        array[nItems++] = n;
    }

    private void sort() {
        for (int i = 1; i < nItems; i++) {
            int j = i - 1;
            int n = array[i];
            while (j >= 0 && array[j] > n) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = n;
        }
    }

    public void display() {
        sort();
        for (int i = 0; i < nItems; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}
