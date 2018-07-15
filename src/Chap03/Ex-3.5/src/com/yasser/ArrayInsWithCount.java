package com.yasser;

public class ArrayInsWithCount {
    private int[] array;
    int size = 0;

    public ArrayInsWithCount(int maxSize) {
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
        int compares = 0;
        for (int i = 1; i < size; i++) {
            int val = array[i];

            int j = i - 1;
            while (j >= 0) {
                compares++;
                if (array[j] <= val) break;
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = val;
        }

        System.out.println("No of compares - " + compares);
    }
}
