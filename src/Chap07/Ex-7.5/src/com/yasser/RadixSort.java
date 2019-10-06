package com.yasser;

import java.util.LinkedList;

import static java.lang.System.out;

public class RadixSort {
    public static void main(String[] args) {
        display(sort(new int[]{}));
        display(sort(new int[]{5, 4, 3, 2}));
        display(sort(new int[]{5, 4, 3, 300, 2}));
        display(sort(new int[]{1, 2, 3, 4}));
        display(sort(new int[]{1}));
        display(sort(new int[]{0, 0, 0}));
    }

    private static void display(int[] nums) {
        for (int n : nums) {
            out.print(n);
            out.print(" ");
        }
        out.println();
    }

    private static void addToLinkedList(LinkedList<Integer>[] linkedListArray, int index, int num) {
        if (linkedListArray[index] == null) linkedListArray[index] = new LinkedList<>();
        linkedListArray[index].add(num);
    }

    private static int[] sort(int[] nums) {
        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] linkedListArray = new LinkedList[10];

        int digit = 1;
        boolean digitNumberPresent = false;

        while (true) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= Math.pow(10, digit - 1)) digitNumberPresent = true;
                int nThDigitOfNum = nThDigit(nums[i], digit);
                addToLinkedList(linkedListArray, nThDigitOfNum, nums[i]);
            }

            if (!digitNumberPresent) break;

            int j = 0;
            for (int i = 0; i < linkedListArray.length; i++) {
                LinkedList<Integer> digitLinkedList = linkedListArray[i];
                if (digitLinkedList != null) {
                    for (int partialSortedNum : linkedListArray[i]) {
                        nums[j++] = partialSortedNum;
                    }
                }
            }

            digit++;
            digitNumberPresent = false;
            for (int i = 0; i < linkedListArray.length; i++) {
                linkedListArray[i] = null;
            }
        }
        return nums;
    }

    private static int nThDigit(int num, int n) {
        int powerOfTen = (int) Math.pow(10, n - 1);
        return (num / powerOfTen) % 10;
    }
}
