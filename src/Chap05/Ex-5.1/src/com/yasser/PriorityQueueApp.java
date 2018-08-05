package com.yasser;

import static java.lang.System.out;

public class PriorityQueueApp {
    public static void main(String[] args) throws Exception {

        PriorityQueue q = new PriorityQueue();
        q.insert(7);
        q.insert(4);
        q.insert(22);
        q.insert(9);
        q.insert(5);

        while (!q.isEmpty()) {
            out.println(q.remove());
        }

    }
}
