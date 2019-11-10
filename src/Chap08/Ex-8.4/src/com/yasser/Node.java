package com.yasser;

import static java.lang.System.out;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static int eval(Node node) {
        if (node.left == null || node.right == null) return node.value;
        return operate(node.value, eval(node.left), eval(node.right));
    }

    private static int operate(int intOp, int num1, int num2) {
        char op = (char) intOp;
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void inOrder(Node node) {
        if (node.left == null || node.right == null) {
            out.print(node.value);
        } else {
            out.print("( ");
            inOrder(node.left);
            out.print(" " + (char) node.value + " ");
            inOrder(node.right);
            out.print(" )");
        }
    }
}
