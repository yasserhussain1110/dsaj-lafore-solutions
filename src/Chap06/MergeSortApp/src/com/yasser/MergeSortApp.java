package com.yasser;

import static java.lang.System.out;

public class MergeSortApp {
    public static void main(String[] args) {
        int[] inp1 = {
                10,
                6
        };
        mergeSort(inp1);
        display(inp1);

        int[] inp2 = {
                77,
                55,
                2,
                33,
                90,
                2,
                102,
                11
        };
        mergeSort(inp2);
        display(inp2);
    }

    private static void display(int[] inp) {
        for (int i : inp) {
            out.print(i);
            out.print(" ");
        }
        out.println();
    }

    private static void mergeSort(int[] arr) {
        mergeSortRecur(arr, 0, arr.length - 1, new int[arr.length]);
    }

    private static void mergeSortRecur(int[] arr, int start, int end, int[] workspace) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSortRecur(arr, start, mid, workspace);
        mergeSortRecur(arr, mid + 1, end, workspace);

        merge(arr, start, mid, end, workspace);
    }

    private static void merge(int[] arr, int start, int mid, int end, int[] workspace) {
        int firstArrPoint = start;
        int secondArrPoint = mid + 1;
        int workspacePoint = start;

        while (firstArrPoint <= mid && secondArrPoint <= end) {
            if (arr[firstArrPoint] < arr[secondArrPoint]) {
                workspace[workspacePoint++] = arr[firstArrPoint++];
            } else {
                workspace[workspacePoint++] = arr[secondArrPoint++];
            }
        }

        int remainingStart, remainingEnd;
        if (firstArrPoint > mid) {
            remainingStart = secondArrPoint;
            remainingEnd = end;
        } else {
            remainingStart = firstArrPoint;
            remainingEnd = mid;
        }

        for (int i = remainingStart; i <= remainingEnd; i++) {
            workspace[workspacePoint++] = arr[i];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = workspace[i];
        }

    }
}
