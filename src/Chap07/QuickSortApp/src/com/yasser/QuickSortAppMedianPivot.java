package com.yasser;

import static java.lang.System.out;

public class QuickSortAppMedianPivot {
    public static void main(String[] args) {
        display(quickSort(new int[]{}));
        display(quickSort(new int[]{1}));
        display(quickSort(new int[]{1, 2}));
        display(quickSort(new int[]{2, 1}));
        display(quickSort(new int[]{2, 2}));
        display(quickSort(new int[]{2, 2, 2}));
        display(quickSort(new int[]{3, 2, 1}));
        display(quickSort(new int[]{3, 3, 2}));
        display(quickSort(new int[]{5, 4, 3, 2, 1}));
        display(quickSort(new int[]{1, 2, 3, 4, 5}));
        display(quickSort(new int[]{4, 3, 2, 1}));
        display(quickSort(new int[]{1, 2, 3, 4}));
        display(quickSort(new int[]{3, 4}));
        display(quickSort(new int[]{4, 3}));
        display(quickSort(new int[]{4, 4}));
        display(quickSort(new int[]{4, 4, 5}));
        display(quickSort(new int[]{77, 55, 2, 33, 90, 2, 102, 11}));
        display(quickSort(new int[]{11}));
        display(quickSort(new int[]{1, 2, 3}));
        display(quickSort(new int[]{9, 8, 7}));
        display(quickSort(new int[]{9, 5, 20, 181, 30, 119, 140, 157, 126, 89, 73, 14, 76, 95, 80}));
        display(quickSort(new int[]{8, 75, 89, 86, 139, 66, 87, 109, 57, 163}));
        display(quickSort(new int[]{1, 5, 3, 4}));
    }

    private static void display(int[] nums) {
        for (int n : nums) {
            out.print(n);
            out.print(" ");
        }
        out.println();
    }

    private static int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int pivot = findPivot(nums, lo, hi);
            quickSort(nums, lo, pivot - 1);
            quickSort(nums, pivot + 1, hi);
        }
    }

    private static int findPivot(int[] nums, int lo, int hi) {
        handleMedian(nums, lo, hi);
        int mid = (lo + hi) / 2;
        int i = mid - 1, j = mid + 1;
        while (i >= lo || j <= hi) {
            for (; i >= lo && nums[i] <= nums[mid]; i--);
            for (; j <= hi && nums[j] > nums[mid]; j++);

            if (i >= lo && j <= hi) {
                swap(nums, i, j);
                i--;
                j++;
            } else if (i >= lo) {
                swap(nums, i, mid - 1);
                swap(nums, mid, mid - 1);
                mid--;
                i--;
            } else if (j <= hi) {
                swap(nums, j, mid + 1);
                swap(nums, mid, mid + 1);
                mid++;
                j++;
            }
        }
        return mid;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void handleMedian(int[] nums, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int min = Math.min(Math.min(nums[lo], nums[mid]), nums[hi]);
        int max = Math.max(Math.max(nums[lo], nums[mid]), nums[hi]);
        int median = (nums[lo] + nums[hi] + nums[mid]) - (min + max);
        nums[mid] = median;
        nums[lo] = min;
        nums[hi] = max;
    }
}
