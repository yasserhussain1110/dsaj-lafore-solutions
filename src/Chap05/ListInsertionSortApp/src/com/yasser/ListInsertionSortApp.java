package com.yasser;

import static java.lang.System.out;

public class ListInsertionSortApp {
    public static void main(String[] args) throws Exception {
        int size = 10;
        int[] numArray = new int[size];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 99);
        }

        out.print("Unsorted array: ");
        for (int num : numArray) {
            out.print(num);
            out.print(" ");
        }
        out.println();

        SortedList theSortedList = new SortedList(numArray);

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = theSortedList.remove();
        }

        out.print("Sorted array: ");
        for (int num : numArray) {
            out.print(num);
            out.print(" ");
        }
        out.println();
    }
}
