package com.yasser;

public class StackX {
    private int[] stack;
    private int current = -1;

    public StackX(int maxSize) {
        stack = new int[maxSize];
    }

    public void push(int n) throws Exception{
        if (current >= stack.length - 1) {
            throw new Exception("Overflow: Stack Full");
        }
        stack[++current] = n;
    }

    public int pop() throws Exception {
        if (current <= -1) {
            throw new Exception("Underflow: Stack Empty");
        }
        return stack[current--];
    }

    public boolean isEmpty() {
        return current <= -1;
    }

    public boolean isFull() {
        return current >= stack.length - 1;
    }

    public int peek() throws Exception{
        if (current <= -1) {
            throw new Exception("Underflow: Stack Empty");
        }
        return stack[current];
    }
}
