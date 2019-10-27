package com.yasser;

import com.sun.istack.internal.NotNull;

import static java.lang.System.out;

public class Node {
    private char val;
    private Node left;
    private Node right;

    public Node(char val) {
        this.val = val;
    }

    public static void display(Node node) {
        if (node != null) {
            display(node.left);
            out.print(node.val);
            out.print(" ");
            display(node.right);
        }
    }

    private static int nearestPowerOfTwoNotGreaterThanN(int n) {
        int log = (int) (Math.log(n) / Math.log(2));
        return (int) Math.pow(2, log);
    }

    public static void add(@NotNull Node node, Node newNode, int index) {
        // Note:- index starts with 1
        if (node == null) return;
        if (index > 3) {
            /**
             * Find nearest power of an index. Check if index is on left or right
             * hand side using it. Move down one level accordingly.
             */
            int n = nearestPowerOfTwoNotGreaterThanN(index);
            if (index >= n + n / 2) {
                add(node.right, newNode, index - n);
            } else {
                add(node.left, newNode, index - n / 2);
            }
        } else if (index == 3) {
            if (node.right == null) {
                node.right = newNode;
            } else {
                node.right.val = newNode.val;
            }
        } else if (index == 2) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                node.left.val = newNode.val;
            }
        } else if (index == 1) {
            node.val = newNode.val;
        }
    }

    public static int level(Node node) {
        if (node == null) return 0;
        return Math.max(level(node.left), level(node.right)) + 1;
    }
}

