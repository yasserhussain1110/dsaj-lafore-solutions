package com.yasser;

import static java.lang.System.out;

public class CompleteLetterBTreeApp {
    public static void main(String[] args) {
        CompleteBTree bTree = new CompleteBTree();
        bTree.create("ABCDEFGHIJ");
        bTree.display();
        out.println(bTree.level());
    }
}
