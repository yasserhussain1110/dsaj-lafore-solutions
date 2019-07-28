package com.yasser;

import static java.lang.System.out;

public class BinaryTreePrinter {
    public static void main(String[] args) {
        int[][] branches;
        branches = makeBranches(16);
        display(branches);
        branches = makeBranches(32);
        display(branches);
    }

    private static void display(int[][] branches) {
        for (int i = 0; i < branches.length; i++) {
            for (int j = 0; j < branches[i].length; j++) {
                out.print((char) branches[i][j]);
            }
            out.println();
        }
    }

    private static int[][] makeBranches(int lineLength) {
        int height = (int) (Math.log(lineLength) / Math.log(2));
        int[][] tree = new int[height + 1][lineLength];
        makeBranchesRecur(tree, 0, 0, lineLength);
        return tree;
    }

    private static void makeBranchesRecur(int[][] tree, int lineNumber, int startPos, int lineLength) {
        if (lineNumber >= tree.length) return;
        tree[lineNumber][startPos + lineLength / 2] = 'X';
        makeBranchesRecur(tree, lineNumber + 1, startPos, lineLength / 2);
        makeBranchesRecur(tree, lineNumber + 1, startPos + lineLength / 2, lineLength / 2);
    }
}
