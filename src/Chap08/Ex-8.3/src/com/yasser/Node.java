package com.yasser;

import static java.lang.System.out;

public class Node {
    private char value;
    private Node left;
    private Node right;

    public Node(char value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static Node create(String letters) {
        return create(letters, 0);
    }

    private static Node create(String letters, int index) {
        if (index >= letters.length()) return null;
        return new Node(
                letters.charAt(index),
                create(letters, 2 * index + 1),
                create(letters, 2 * index + 2));
    }

    public static int level(Node node) {
        if (node == null) return 0;
        return Math.max(level(node.left), level(node.right)) + 1;
    }

    public static void display(Node node) {
        if (node != null) {
            display(node.left);
            out.print(node.value);
            out.print(" ");
            display(node.right);
        }
    }
}
