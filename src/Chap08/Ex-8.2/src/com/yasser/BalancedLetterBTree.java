package com.yasser;

public class BalancedLetterBTree {
    private Node start;

    public void create(String letters) {
        start = Node.create(letters);
    }

    public void display() {
        Node.display(start);
    }

    public int level() {
        return Node.level(start);
    }
}
