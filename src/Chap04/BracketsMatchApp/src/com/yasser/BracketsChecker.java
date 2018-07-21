package com.yasser;

public class BracketsChecker {
    private String input;

    public BracketsChecker(String input) {
        this.input = input;
    }

    private boolean isOpen(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean isClose(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private char getCorrespondingOpen(char c) {
        switch (c) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                return '\0';
        }
    }

    public String check() throws Exception {
        StackX<Character> theStack = new StackX<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);
            if (isOpen(val)) {
                theStack.push(val);
            }

            if (isClose(val)) {
                if (theStack.isEmpty()) {
                    return "Error: " + val + " at " + i;
                }
                char topBracket = theStack.pop();
                if (getCorrespondingOpen(val) != topBracket) {
                    return "Error: " + val + " at " + i;
                }
            }
        }

        return theStack.isEmpty() ? "" : "Error: missing right delimiter";
    }
}
