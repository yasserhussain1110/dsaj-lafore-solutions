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

    private int averageValueAtIndex(int index1, int index2) {
        return (array[index1] + array[index2]) / 2;
    }

    public int median() {
        return size % 2 == 0 ? averageValueAtIndex(size / 2, size / 2 - 1) : array[size / 2];
    }

    public void noDups() {
        int shifts = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == array[i + 1]) {
                shifts++;
            } else {
                array[i + 1 - shifts] = array[i + 1];
            }
        }
        size -= shifts;
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
