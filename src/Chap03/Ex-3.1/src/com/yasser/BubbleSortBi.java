package com.yasser;

public class BubbleSortBi {
    private int[] array;
    int size = 0;

    public BubbleSortBi(int maxSize) {
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
        for (int fromTop = 0, fromBottom = size - 1; fromTop < fromBottom; fromBottom--, fromTop++) {
            for (int j = fromTop; j < fromBottom; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            for (int k = fromBottom - 1; k > fromTop; k--) {
                if (array[k - 1] > array[k]) {
                    int temp = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = temp;
                }
            }
        }
    }

}
