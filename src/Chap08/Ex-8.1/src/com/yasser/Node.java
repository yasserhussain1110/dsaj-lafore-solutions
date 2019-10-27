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
}
