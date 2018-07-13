package com.yasser;

public class ArrayIns {
    private int[] array;
    int size = 0;

    public ArrayIns(int maxSize) {
        array = new int[maxSize];
    }

    public void insert(int num) {
        array[size++] = num;
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.println(array[i]);
        System.out.println();
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int val = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > val) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = val;
        }
    }
}
