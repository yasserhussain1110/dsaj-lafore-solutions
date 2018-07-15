package com.yasser;

public class OddEvenSort {
    private int[] array;
    int size = 0;

    public OddEvenSort(int maxSize) {
        array = new int[maxSize];
    }

    public void insert(int num) {
        array[size++] = num;
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.println(array[i]);
        System.out.println();
    }

    public void oddEvenSort() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 1; i < size - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    sorted = false;
                }
            }

            for (int i = 0; i < size - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    sorted = false;
                }
            }
        }
    }
}
