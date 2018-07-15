package com.yasser;

public class InsertSortAppWithCount {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInsWithCount arr = new ArrayInsWithCount(maxSize);

        arr.insert(10);
        arr.insert(9);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(1);

        arr.insertionSort();

        arr = new ArrayInsWithCount(maxSize);
        arr.insert(20);
        arr.insert(19);
        arr.insert(18);
        arr.insert(17);
        arr.insert(16);
        arr.insert(15);
        arr.insert(14);
        arr.insert(13);
        arr.insert(12);
        arr.insert(11);
        arr.insert(10);
        arr.insert(9);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(1);

        arr.insertionSort();

        arr = new ArrayInsWithCount(maxSize);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(9);
        arr.insert(10);
        arr.insertionSort();

        arr = new ArrayInsWithCount(maxSize);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(9);
        arr.insert(10);
        arr.insert(11);
        arr.insert(12);
        arr.insert(13);
        arr.insert(14);
        arr.insert(15);
        arr.insert(18);
        arr.insert(17);
        arr.insert(16);
        arr.insert(19);
        arr.insert(20);
        arr.insertionSort();
    }
}
