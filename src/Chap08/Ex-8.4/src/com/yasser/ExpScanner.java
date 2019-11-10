package com.yasser;

public class ExpScanner {
    private String exp;
    private int currentIndex;

    public ExpScanner(String exp) {
        this.exp = exp.trim();
        this.currentIndex = 0;
    }

    public String next() {
        ensureHasNext();
        String next;
        if ("+-*/".indexOf(exp.charAt(currentIndex)) > -1) {
            next = nextOperator();
        } else {
            next = nextNum();
        }
        for (; currentIndex < exp.length() && exp.charAt(currentIndex) == ' '; currentIndex++) ;
        return next;
    }

    private String nextOperator() {
        return "" + exp.charAt(currentIndex++);
    }

    private String nextNum() {
        StringBuilder sb = new StringBuilder();
        for (; currentIndex < exp.length(); currentIndex++) {
            char c = exp.charAt(currentIndex);
            if ('0' <= c && c <= '9') {
                sb.append(exp.charAt(currentIndex));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public boolean hasNext() {
        return currentIndex < exp.length();
    }

    private void ensureHasNext() {
        if (!hasNext()) {
            throw new UnsupportedOperationException("Empty");
        }
    }
}
