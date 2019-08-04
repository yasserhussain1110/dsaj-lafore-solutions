package com.yasser;

import static java.lang.System.out;

public class ShellSortApp {
    public static void main(String[] args) {
        display(sort(new int[]{77, 55, 2, 33, 90, 2, 102, 11}));
        display(sort(new int[]{11}));
        display(sort(new int[]{1, 2, 3}));
        display(sort(new int[]{9, 8, 7}));
        display(sort(new int[]{9, 5, 20, 181, 30, 119, 140, 157, 126, 89, 73, 14, 76, 95, 80}));
        display(sort(new int[]{8, 75, 89, 86, 139, 66, 87, 109, 57, 163}));
        display(sort(generateNums(10)));
        display(sort(generateNums(15)));

    }

    private static int[] generateNums(int maxSize) {
        int[] nums = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            nums[i] = (int) (Math.random() * 200);
        }
        return nums;
    }

    private static void display(int[] sort) {
        for (int i : sort) {
            out.print(i);
            out.print(" ");
        }
        out.println();
    }

    private static int calculateH(int arrayLength) {
        int h = 1;
        while (h < arrayLength) {
            h = 3 * h + 1;
        }
        return h / 3;
    }

    private static int[] sort(int[] nums) {
        int h = calculateH(nums.length);
        while (h > 0) {
            for (int i = h; i < nums.length; i++) {
                int temp = nums[i];
                int j;
                for (j = i - h; j >= 0 && nums[j] > temp; j -= h) nums[j + h] = nums[j];
                nums[j + h] = temp;
            }
            h /= 3;
        }
        return nums;
    }

    private static int[] sortFirstTry(int[] nums) {
        int h = calculateH(nums.length);
        while (h > 0) {
            for (int a = 0; a < h; a++) {
                for (int i = a + h; i < nums.length; i += h) {
                    int j;
                    for (j = i - h; j >= a; j -= h) {
                        if (nums[j] <= nums[i]) {
                            break;
                        }
                    }
                    int temp = nums[i];
                    for (int k = i - h; k > j; k -= h) nums[k + h] = nums[k];
                    nums[j + h] = temp;
                }
            }
            h /= 3;
        }
        return nums;
    }
}
