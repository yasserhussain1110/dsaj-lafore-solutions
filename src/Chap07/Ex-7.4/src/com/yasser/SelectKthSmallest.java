package com.yasser;

import static java.lang.System.out;

public class SelectKthSmallest {
    public static void main(String[] args) {
        out.println(kth(new int[]{1}, 1));
        out.println(kth(new int[]{1}, 2));
        out.println(kth(new int[]{1}, 3));
        out.println(kth(new int[]{1, 2}, 2));
        out.println(kth(new int[]{2, 1}, 2));
        out.println(kth(new int[]{1, 2, 3, 4, 5}, 3));
        out.println(kth(new int[]{1, 2, 3, 4, 5, 6}, 4));
        out.println(kth(new int[]{4, 6, 5, 3, 1, 2}, 4));
        out.println(kth(new int[]{4, 6, 5, 3, 1, 2}, 5));
        out.println(kth(new int[]{4, 6, 5, 3, 1, 2}, 2));
        out.println(kth(new int[]{10, 7, 23, 5, 61, 92, 11}, 2));
    }

    private static int kth(int[] nums, int k) {
        int kthIndex = k - 1;
        int hi = nums.length - 1;
        kth(nums, kthIndex, 0, hi);
        return nums[kthIndex <= hi ? kthIndex : hi];
    }

    private static void kth(int[] nums, int k, int lo, int hi) {
        if (lo < hi) {
            int pivot = pivot(nums, lo, hi);
            if (pivot < k) {
                kth(nums, k, pivot + 1, hi);
            } else if (pivot > k) {
                kth(nums, k, lo, pivot - 1);
            }
        }
    }

    private static int pivot(int[] nums, int lo, int hi) {
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
