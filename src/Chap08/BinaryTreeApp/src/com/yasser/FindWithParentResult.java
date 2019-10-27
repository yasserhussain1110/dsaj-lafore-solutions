package com.yasser;

public class FindWithParentResult {
    private Node parent;
    private Node node;
    private boolean isLeftChild;

    public FindWithParentResult(Node parent, Node node, boolean isLeftChild) {
        this.parent = parent;
        this.node = node;
        this.isLeftChild = isLeftChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public boolean isLeftChild() {
        return isLeftChild;
    }

    public void setLeftChild(boolean leftChild) {
        isLeftChild = leftChild;
    }
}
