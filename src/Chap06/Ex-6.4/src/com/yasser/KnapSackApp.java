package com.yasser;

import static java.lang.System.out;

public class KnapSackApp {
    public static void main(String[] args) {
        findSingleWeightCombination(5, new int[]{1, 2, 3});
        findSingleWeightCombination(15, new int[]{1, 2, 3});
        findSingleWeightCombination(15, new int[]{1, 7, 8, 5, 3});
        findSingleWeightCombination(8, new int[]{6, 3, 5});
        findAllWeightCombination(8, new int[]{6, 3, 5, 7, 2});
        findAllWeightCombination(15, new int[]{5, 1, 2, 7, 6, 3});
        findAllWeightCombination(7, new int[]{10, 4, 2, 7, 5, 3});
    }

    private static void findSingleWeightCombination(int totalWeight, int[] weights) {
        int[] result = new int[weights.length + 1];
        knapSackSingle(totalWeight, weights, 0, 1, result);
    }

    private static void findAllWeightCombination(int totalWeight, int[] weights) {
        int[] result = new int[weights.length + 1];
        knapSackAll(totalWeight, weights, 0, 1, result);
    }

    private static void knapSackAll(int totalWeight, int[] weights, int startPos, int currentResultPos, int[] result) {
        if (totalWeight == 0) {
            result[0] = currentResultPos - 1;
            display(result);
            return;
        } else if (totalWeight < 0) return;

        for (int i = startPos; i < weights.length; i++) {
            int currentWeight = weights[i];
            result[currentResultPos] = currentWeight;
            knapSackAll(totalWeight - currentWeight, weights, i + 1,
                    currentResultPos + 1, result);
        }
    }

    private static boolean knapSackSingle(int totalWeight, int[] weights, int startPos,
                                          int currentResultPos, int[] result) {
        if (totalWeight == 0) {
            result[0] = currentResultPos - 1;
            display(result);
            return true;
        } else if (totalWeight < 0) return false;

        for (int i = startPos; i < weights.length; i++) {
            int currentWeight = weights[i];
            result[currentResultPos] = currentWeight;
            boolean resultStatus = knapSackSingle(totalWeight - currentWeight, weights, i + 1,
                    currentResultPos + 1, result);
            if (resultStatus) {
                return true;
            }
        }
        return false;
    }

    private static void display(int[] result) {
        for (int i = 1; i <= result[0]; i++) {
            out.print(result[i]);
            out.print(" ");
        }
        out.println();
    }
}
