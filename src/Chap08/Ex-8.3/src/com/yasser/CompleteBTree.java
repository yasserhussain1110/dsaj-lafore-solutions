package com.yasser;

import static java.lang.System.out;

public class CompleteBTree {
    private Node start;

    public void create(String letters) {
        start = Node.create(letters);
    }

    public void display() {
        Node.display(start);
        out.println();
    }

    public int level() {
        return Node.level(start);
    }
}
