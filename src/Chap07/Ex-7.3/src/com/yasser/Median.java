package com.yasser;

import static java.lang.System.out;

public class Median {
    public static void main(String[] args) {
        out.println(median(new int[]{1}));
        out.println(median(new int[]{1, 2}));
        out.println(median(new int[]{2, 1}));
        out.println(median(new int[]{1, 2, 3, 4, 5}));
        out.println(median(new int[]{1, 2, 3, 4, 5, 6}));
        out.println(median(new int[]{4, 6, 5, 3, 1, 2}));
    }

    private static int median(int[] nums) {
        median(nums, 0, nums.length - 1);
        return nums[(nums.length - 1) / 2];
    }

    private static void median(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int mid = (hi + lo) / 2;
            int pivot = pivot(nums, lo, hi);
            if (pivot < mid) {
                median(nums, pivot + 1, hi);
            } else if (pivot > mid) {
                median(nums, lo, pivot - 1);
            }
        }
    }

    private static int pivot(int[] nums, int lo, int hi) {
        /** TODO:-
         * Pivot from median
         */
        int i = lo, j = hi - 1;
        while (true) {
            for (; nums[i] < nums[hi]; ++i) ;
            for (; j >= lo && nums[j] >= nums[hi]; --j) ;
            if (i > j) break;
            swap(nums, i, j);
        }
        swap(nums, i, hi);
        return i;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
