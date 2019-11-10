package com.yasser;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.toHexString;
import static java.lang.Math.max;
import static java.lang.System.out;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static void insertNode(Node parent, Node child) {
        if (child.getData() <= parent.getData()) {
            if (parent.getLeft() == null) parent.setLeft(child);
            else insertNode(parent.getLeft(), child);
        } else {
            if (parent.getRight() == null) parent.setRight(child);
            else insertNode(parent.getRight(), child);
        }
    }

    public static Node findNode(Node node, int data) {
        if (node == null) return null;
        if (data == node.getData()) return node;
        if (data < node.getData()) return findNode(node.getLeft(), data);
        return findNode(node.getRight(), data);
    }

    public static void displayNode(Node node) {
        if (node == null) return;
        displayNode(node.getLeft());
        out.print(node.getData());
        out.print(" ");
        displayNode(node.getRight());
    }

    public static List<Integer> flatten(Node node) {
        if (node == null) return new ArrayList<>();
        List<Integer> allData = flatten(node.getLeft());
        allData.add(node.getData());
        allData.addAll(flatten(node.getRight()));
        return allData;
    }

    public static Node build(List<Integer> data) {
        return build(data, 0, data.size() - 1);
    }

    private static Node build(List<Integer> data, int start, int end) {
        if (start > end) return null;
        int mid = (start + end + 1) / 2;
        int midData = data.get(mid);
        return new Node(midData, build(data, start, mid - 1), build(data, mid + 1, end));
    }

    public static int nodeDepth(Node node) {
        if (node == null) return 0;
        return max(nodeDepth(node.getLeft()), nodeDepth(node.getRight())) + 1;
    }

    public static FindWithParentResult findNodeWithParent(Node node, int data) {
        return findNodeWithParent(null, node, data, true);
    }

    private static FindWithParentResult findNodeWithParent(Node parentNode, Node currentNode, int data, boolean isLeftChild) {
        if (currentNode == null) return null;
        if (data == currentNode.getData())
            return new FindWithParentResult(parentNode, currentNode, isLeftChild);
        if (data < currentNode.getData())
            return findNodeWithParent(currentNode, currentNode.getLeft(), data, true);
        return findNodeWithParent(currentNode, currentNode.getRight(), data, false);
    }

    public static FindWithParentResult findSmallestNodeWithParent(@NotNull Node node) {
        Node parentNode = null;
        while(node.getLeft() != null) {
            parentNode = node;
            node = node.getLeft();
        }
        return new FindWithParentResult(parentNode, node, true);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + (left == null ? "null" : "Node@" + toHexString(left.hashCode())) +
                ", right=" + (right == null ? "null" : "Node@" + toHexString(right.hashCode())) +
                '}';
    }
}
