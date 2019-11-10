package com.yasser;

import static java.lang.System.out;

public class PostfixToTreeApp {

    public static void main(String[] args) {
        PostFixParser parser = new PostFixParser();
        out.println(parser.parse("2 3 +").eval());
        out.println(parser.parse("2 10 17 - +").eval());
        out.println(parser.parse("10 5 + 2 -").eval());
        out.println(parser.parse("10 5 2 - +").eval());
        out.println(parser.parse("5 4 + 6 + 7 -").eval());
        out.println(parser.parse("3 2 5 + *").eval());

        BTree tree1 = parser.parse("9 2 - 7 5 + *");
        out.println(tree1.eval());
        tree1.inOrder();
    }
}
