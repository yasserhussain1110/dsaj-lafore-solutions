package com.yasser;

public class ArraySel {
    private int[] array;
    int size = 0;

    public ArraySel(int maxSize) {
        array = new int[maxSize];
    }

    public void insert(int num) {
        array[size++] = num;
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.println(array[i]);
        System.out.println();
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i ++) {
            int smallestIndex = i;
            for (int j = i+1; j < size; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }
}
