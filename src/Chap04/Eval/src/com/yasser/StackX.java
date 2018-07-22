package com.yasser;

public class StackX<T> {
    private T[] stack;
    private int current = -1;

    public StackX(int maxSize) {
        stack = (T[]) new Object[maxSize];
    }

    public void push(T v) throws Exception{
        if (current >= stack.length - 1) {
            throw new Exception("Overflow: Stack Full");
        }
        stack[++current] = v;
    }

    public T pop() throws Exception {
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

    public T peek() throws Exception{
        if (current <= -1) {
            throw new Exception("Underflow: Stack Empty");
        }
        return stack[current];
    }
}
