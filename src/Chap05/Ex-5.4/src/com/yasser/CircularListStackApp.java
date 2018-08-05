package com.yasser;

import static java.lang.System.out;

public class CircularListStackApp {
    public static void main(String[] args) throws Exception {
        CircularListStack listStack = new CircularListStack();
        listStack.push(5);
        listStack.push(4);
        listStack.push(3);
        listStack.push(2);
        listStack.push(1);

        while (!listStack.isEmpty()) {
            out.println(listStack.pop());
        }
        // out.println(listStack.pop());  // uncommenting this line will throw exception
    }
}
