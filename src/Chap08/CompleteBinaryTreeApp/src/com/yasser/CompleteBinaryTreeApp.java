package com.yasser;

import static com.yasser.Utils.numberOfPlus;
import static java.lang.System.out;

public class CompleteBinaryTreeApp {
    public static void main(String[] args) {
        CompleteBTree bTree1 = new CompleteBTree();
        addChars(bTree1, "ABC");
        CompleteBTree bTree2 = new CompleteBTree();
        addChars(bTree2, "ABCDEFGH");
        out.println(bTree2.level());
        CompleteBTree bTree3 = new CompleteBTree();
        addChars(bTree3, "AB");
        out.println(bTree3.level());


        CompleteBTree bTree4 = new CompleteBTree();
        makeTreeWithAddExpressions(bTree4, "ABCDEFGH");
        out.println(bTree4.level());

        CompleteBTree bTree5 = new CompleteBTree();
        makeTreeWithAddExpressions(bTree5, "ABC");
        out.println(bTree5.level());
    }

    private static void addChars(CompleteBTree completeBTree, String input) {
        for (int i = 0; i < input.length(); i++) {
            completeBTree.add(input.charAt(i));
        }
    }

    private static void makeTreeWithAddExpressions(CompleteBTree completeBTree, String input) {
        /**
         *                          +
         *                   +             +
         *               +      +       +      +
         *             A   B  C   D   E   F  G   H
         */

        int numberOfPlus = numberOfPlus(input.length());
        for (int i = 0; i < numberOfPlus; i++) {
            completeBTree.add('+');
        }

        for (int i = 0; i < input.length(); i++) {
            completeBTree.add(input.charAt(i));
        }

    }
}
