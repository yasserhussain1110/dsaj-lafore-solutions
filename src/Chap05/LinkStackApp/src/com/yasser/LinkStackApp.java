package com.yasser;

public class LinkStackApp {
    public static void main(String[] args) throws Exception {
        LinkStack theStack = new LinkStack();

        theStack.push(20);
        theStack.push(40);

        theStack.display();

        theStack.push(60);
        theStack.push(80);

        theStack.display();

        theStack.pop();
        theStack.pop();

        theStack.display();
    }
}
