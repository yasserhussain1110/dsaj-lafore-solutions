package com.yasser;

import java.io.PrintStream;

public class OrderedArrayApp {

    static PrintStream out = System.out;

    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

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

        int searchKey = 55;
        if (arr.find(searchKey) != -1)
            out.println("Found " + searchKey);
        else
            out.println("Can't find " + searchKey);

        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        OrdArray arr1 = new OrdArray(maxSize);
        arr1.insert(5);
        arr1.insert(4);
        arr1.insert(8);
        arr1.insert(20);
        arr1.insert(10);

        OrdArray arr2 = new OrdArray(maxSize);
        arr2.insert(17);
        arr2.insert(3);
        arr2.insert(2);

        OrdArray arr3 = OrdArray.merge(arr1, arr2);
        arr3.display();
    }
}
