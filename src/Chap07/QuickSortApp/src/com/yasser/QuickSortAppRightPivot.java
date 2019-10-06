package com.yasser;

import static java.lang.System.out;

public class QuickSortAppRightPivot {
    public static void main(String[] args) {
        display(sort(new int[]{3, 4}));
        display(sort(new int[]{4, 3}));
        display(sort(new int[]{4, 4}));
        display(sort(new int[]{4, 4, 5}));
        display(sort(new int[]{77, 55, 2, 33, 90, 2, 102, 11}));
        display(sort(new int[]{11}));
        display(sort(new int[]{1, 2, 3}));
        display(sort(new int[]{9, 8, 7}));
        display(sort(new int[]{9, 5, 20, 181, 30, 119, 140, 157, 126, 89, 73, 14, 76, 95, 80}));
        display(sort(new int[]{8, 75, 89, 86, 139, 66, 87, 109, 57, 163}));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        int lo = start;
        int hi = end - 1;
        int pivot = arr[end];
        while (true) {
            for (; arr[lo] < pivot; lo++);
            for (; hi > lo && arr[hi] > pivot; hi--);
            if (lo >= hi) break;
            swap(arr, lo, hi);
        }
        swap(arr, lo, end);
        return lo;
    }

    private static int[] sort(int[] arr) {
        sortRecur(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sortRecur(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            sortRecur(arr, start, pivotIndex - 1);
            sortRecur(arr, pivotIndex + 1, end);
        }
    }

    private static void display(int[] sort) {
        for (int i : sort) {
            out.print(i);
            out.print(" ");
        }
        out.println();
    }
}
