package com.yasser;

public class DequeApp {
    public static void main(String[] args) throws Exception {
        Deque theDeQueue = new Deque(5);

        theDeQueue.insertLeft(10);
        theDeQueue.insertLeft(11);
        theDeQueue.insertLeft(14);
        theDeQueue.display();

        theDeQueue.empty();
        theDeQueue.insertRight(10);
        theDeQueue.insertRight(20);
        theDeQueue.insertRight(40);
        theDeQueue.removeLeft();
        theDeQueue.display();

        theDeQueue.empty();
        theDeQueue.insertRight(20);
        theDeQueue.insertRight(21);
        theDeQueue.insertRight(23);
        theDeQueue.display();

        theDeQueue.empty();
        theDeQueue.insertLeft(10);
        theDeQueue.insertLeft(11);
        theDeQueue.insertLeft(14);
        theDeQueue.insertLeft(20);
        theDeQueue.insertLeft(22);
        theDeQueue.removeRight();
        theDeQueue.insertLeft(30);
        theDeQueue.display();

        theDeQueue.empty();
        theDeQueue.insertLeft(10);
        theDeQueue.insertLeft(11);
        theDeQueue.insertLeft(14);
        theDeQueue.insertRight(9);
        theDeQueue.insertRight(5);
        theDeQueue.removeRight();
        theDeQueue.insertLeft(20);
        theDeQueue.display();

        theDeQueue.empty();
        theDeQueue.insertRight(10);
        theDeQueue.insertRight(11);
        theDeQueue.insertRight(14);
        theDeQueue.insertLeft(9);
        theDeQueue.insertLeft(5);
        theDeQueue.removeLeft();
        theDeQueue.insertRight(20);
        theDeQueue.display();
    }
}
