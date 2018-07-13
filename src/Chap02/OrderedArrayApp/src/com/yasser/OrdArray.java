package com.yasser;

import java.io.PrintStream;

public class OrdArray {
    int[] array;
    int size = 0;

    static PrintStream out = System.out;

    public OrdArray(int maxSize) {
        array = new int[maxSize];
    }

    public OrdArray(int[] nums, int maxSize) {
        array =  new int[maxSize];
        size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }
    }

    private void insertWhenLessThanTwo(int key) {
        if (size == 0) {
            array[size++] = key;
        } else if (size == 1) {
            size++;
            int firstVal = array[0];
            if (firstVal > key) {
                array[0] = key;
                array[1] = firstVal;
            } else {
                array[1] = key;
            }
        }
    }

    private int findInsertIndex(int key) {
        if (key <= array[0]) {
            return 0;
        }

        if (key >= array[size - 1]) {
            return size;
        }

        int startIndex = 0;
        int endIndex = size - 1;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            int midNext = mid + 1;
            if (key >= array[mid] && key <= array[midNext]) {
                return midNext;
            } else if (key < array[mid]) {
                endIndex = mid;
            } else if (key > array[midNext]) {
                startIndex = midNext;
            }
        }

        return -1;
    }

    public void insert(int key) {
        if (size < 2) {
            insertWhenLessThanTwo(key);
            return;
        }

        int index = findInsertIndex(key);

        size++;
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = key;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            out.println(array[i]);
        }
    }

    public boolean delete(int key) {
        int keyIndex = find(key);
        if (keyIndex == -1) return false;
        for (int i = keyIndex; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public int find(int key) {
        int startIndex = 0;
        int endIndex = size - 1;

        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (array[midIndex] == key) {
                return midIndex;
            } else if (array[midIndex] > key) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public int maxSize() {
        return array.length;
    }

    public int get (int i) {
        return array[i];
    }

    public static OrdArray merge(OrdArray array1, OrdArray array2) {
        int size = array1.size() + array2.size();
        int[] merged = new int[size];
        int i,j,k;
        for (i=0,j=0,k=0; i < merged.length && j < array1.size() && k < array2.size(); i++) {
            if (array1.get(j) < array2.get(k)) {
                merged[i] = array1.get(j++);
            } else {
                merged[i] = array2.get(k++);
            }
        }

        if (j < array1.size()) {
            for (; i < size; i++,j++) {
                merged[i] =  array1.get(j);
            }
        } else if (k < array2.size()) {
            for (; i < size; i++,k++) {
                merged[i] =  array2.get(k);
            }
        }

        return new OrdArray(merged, array1.maxSize() + array2.maxSize());
    }
}
