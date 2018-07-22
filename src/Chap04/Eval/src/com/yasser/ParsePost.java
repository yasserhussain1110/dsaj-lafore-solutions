package com.yasser;

public class ParsePost {
    private String expression;
    private StackX<Double> theStack;

    public ParsePost(String exp) {
        expression = exp;
        theStack = new StackX<>(expression.length());
    }

    private boolean isOperator(char c) {
        return "+-*/".indexOf(c) > -1;
    }

    private double processOperator(char c, double first, double second) throws Exception {
        switch (c) {
            case '+':
                return second + first;
            case '-':
                return second - first;
            case '*':
                return second * first;
            case '/':
                return second / first;
            default:
                return 0.0;
        }
    }

    public double doParse() throws Exception {
        for (int i = 0; i < expression.length(); i++) {
            char v = expression.charAt(i);
            if (isOperator(v)) {
                double first = theStack.pop();
                double second = theStack.pop();
                double p = processOperator(v, first, second);
                theStack.push(p);
            } else {
                theStack.push(Double.parseDouble("" + v));
            }
        }
        return theStack.pop();
    }
}
