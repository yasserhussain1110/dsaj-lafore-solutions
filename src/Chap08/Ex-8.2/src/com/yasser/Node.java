package com.yasser;

import static java.lang.System.out;

public class Node {
    private char val;
    private Node left;
    private Node right;

    public Node(char val) {
        this.val = val;
    }

    public Node(char val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void display(Node node) {
        if (node != null) {
            display(node.left);
            out.print(node.val);
            out.print(" ");
            display(node.right);
        }
    }

    public static Node create(String letters) {
        return create(letters, 0, letters.length() - 1);
    }

    public static Node create(String letters, int start, int end) {
        int length = end - start + 1;
        if (length == 1) {
            return new Node(letters.charAt(start));
        } else {
            int mid = (start + end) / 2;
            return new Node('+', create(letters, start, mid), create(letters, mid + 1, end));
        }

    }

    public static int level(Node node) {
        if (node == null) return 0;
        return Math.max(level(node.left), level(node.right)) + 1;
    }
}
