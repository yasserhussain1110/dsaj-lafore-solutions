package com.yasser;

import static java.lang.System.out;

public class BalancedLetterBTreeApp {

    public static void main(String[] args) {
        BalancedLetterBTree bTree = new BalancedLetterBTree();
        bTree.create("ABC");
        bTree.create("ABCDEFGH");
        out.println(bTree.level());
        bTree.create("AB");
        out.println(bTree.level());
        bTree.create("ABCDEF");
        out.println(bTree.level());
    }
}
