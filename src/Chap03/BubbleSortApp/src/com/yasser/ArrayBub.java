package com.yasser;

public class ArrayBub {
    private int[] array;
    int size = 0;

    public ArrayBub(int maxSize) {
        array = new int[maxSize];
    }

    public void insert(int num) {
        array[size++] = num;
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.println(array[i]);
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
