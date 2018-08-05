package com.yasser;

import static java.lang.System.out;

public class DequeApp {
    public static void main(String[] args) throws Exception {
        Deque q = new Deque();
        q.insertLeft(4);
        q.insertRight(5);
        q.insertLeft(2);
        q.display();

        q.insertLeft(6);
        q.removeRight();
        q.insertRight(17);
        q.removeLeft();

        while (!q.isEmpty()) {
            out.print(q.removeLeft() + " ");
        }
    }
}
