package com.yasser;

import static com.yasser.Node.build;
import static com.yasser.Node.findLargest;
import static com.yasser.Node.findNodeWithParent;
import static com.yasser.Node.flatten;
import static com.yasser.Node.insertNode;
import static com.yasser.Node.findNode;
import static com.yasser.Node.displayNode;
import static com.yasser.Node.nodeDepth;
import static java.lang.System.out;

public class BinaryTree {
    private Node start;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            insertNode(start, newNode);
        }
    }

    public Node find(int data) {
        return findNode(start, data);
    }

    public void display() {
        displayNode(start);
        out.println();
    }

    public void balance() {
        start = build(flatten(start));
    }

    public void delete(int data) {
        FindWithParentResult result = findNodeWithParent(start, data);
        if (result == null) return;
        Node node = result.getNode();
        if (node.getLeft() == null) {
            replaceChild(result, node.getRight());
        } else if (node.getRight() == null) {
            replaceChild(result, node.getLeft());
        } else {
            Node nodeToAddTo = findLargest(node.getLeft());
            nodeToAddTo.setRight(node.getRight());
            replaceChild(result, node.getLeft());
        }
    }

    public int depth() {
        return nodeDepth(start);
    }

    private void replaceChild(FindWithParentResult result, Node newNode) {
        if (result.getParent() == null) {
            start = newNode;
        } else {
            if (result.isLeftChild()) {
                result.getParent().setLeft(newNode);
            } else {
                result.getParent().setRight(newNode);
            }
        }

    }
}
