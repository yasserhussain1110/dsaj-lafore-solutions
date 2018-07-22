package com.yasser;

public class InToPost {
    private String input;
    private StackX<Character> theStack;

    public static void main(String[] args) throws Exception {
        System.out.println(convert("1 + 2"));
        System.out.println(convert("1 + 2 * 3"));
        System.out.println(convert("(1 + 2) * 3"));
        System.out.println(convert("(2 + 3) * 4"));
        System.out.println(convert("(1 + (5 + 6) * 7) * 3"));
        System.out.println(convert("2 - (1 + (5 + 6) * 7) / 8 * 3"));
    }

    public static String convert(String s) throws Exception {
        return new InToPost(s).doTrans();
    }

    public InToPost(String input) {
        this.input = input;
        theStack = new StackX<>(input.length());
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isOperator(char c) {
        return "+-*/".indexOf(c) > -1;
    }

    private boolean isParens(char c) {
        return c == '(' || c == ')';
    }

    private boolean isGreater(char op1, char op2) {
        String op = "" + op1 + op2;
        switch (op) {
            case "/-":
                return true;
            case "/+":
                return true;
            case "*-":
                return true;
            case "*+":
                return true;
            default:
                return false;
        }
    }

    private boolean isLessOrEqual(char op1, char op2) {
        return !isGreater(op1, op2);
    }

    private String processOperator(char c) throws Exception {
        if (theStack.isEmpty() || theStack.peek() == '(') {
            theStack.push(c);
            return "";
        } else {
            char prev = theStack.peek();
            if (isLessOrEqual(c, prev)) {
                theStack.pop();
                theStack.push(c);
                return "" + prev;
            } else {
                theStack.push(c);
                return "";
            }
        }
    }

    private String processParens(char c) throws Exception {
        if (c == '(') {
            theStack.push('(');
            return "";
        } else {
            char v;
            String out = "";
            while ((v = theStack.pop()) != '(') {
                out += v;
            }
            return out;
        }
    }

    public String doTrans() throws Exception {
        String out = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isDigit(c)) {
                out += c;
            } else if (isOperator(c)) {
                out += processOperator(c);
            } else if (isParens(c)) {
                out += processParens(c);
            }
        }

        while (!theStack.isEmpty()) {
            out += theStack.pop();
        }
        return out;
    }
}
