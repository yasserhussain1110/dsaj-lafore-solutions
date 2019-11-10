package com.yasser;

import java.util.Stack;

public class PostFixParser {
    public BTree parse(String exp) {
        ExpScanner scanner = new ExpScanner(exp);
        Stack<BTree> stack = new Stack<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            if ("+-*/".contains(next)) {
                BTree right = stack.pop();
                BTree left = stack.pop();
                stack.push(new BTree(next.charAt(0), left, right));
            } else {
                int num = Integer.parseInt(next);
                stack.push(new BTree(num));
            }
        }
        return stack.pop();
    }
}
