package com.yasser;

import static java.lang.System.out;

public class BTree {
    private Node start;

    public BTree(int value) {
        start = new Node(value);
    }

    public BTree(int op, BTree left, BTree right) {
        start = new Node(op, left.start, right.start);
    }

    public int eval() {
        return Node.eval(start);
    }

    public void inOrder() {
        Node.inOrder(start);
        out.println();
    }
}
