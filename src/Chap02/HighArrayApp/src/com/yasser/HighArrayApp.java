package com.yasser;

import java.io.PrintStream;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;

        PrintStream out = System.out;

        HighArray arr = new HighArray(maxSize);

        out.println(arr.getMax());

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        out.println(arr.getMax());

        int searchKey = 35;
        if (arr.find(searchKey))
            out.println("Found " + searchKey);
        else
            out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
        out.println(arr.getMax());

        sortArray(arr);
        arr.display();

        HighArray arr2 = new HighArray(maxSize);
        arr2.insert(20);
        arr2.insert(10);
        arr2.insert(1);
        arr2.insert(90);
        arr2.insert(20);
        arr2.insert(34);
        arr2.insert(56);
        arr2.insert(90);
        arr2.insert(11);
        arr2.insert(25);
        arr2.insert(56);
        arr2.insert(40);
        arr2.display();

        arr2.noDups();
        arr2.display();
    }

    public static void sortArray (HighArray hArr) {
        int[] sorted = new int[hArr.getSize()];
        for (int i = 0; i <  sorted.length; i++) {
            sorted[i] = hArr.removeMax();
        }

        for (int i = sorted.length - 1; i >= 0; i--) {
            hArr.insert(sorted[i]);
        }
    }
}
