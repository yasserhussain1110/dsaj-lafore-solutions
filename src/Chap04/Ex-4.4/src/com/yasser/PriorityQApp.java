package com.yasser;

import static java.lang.System.*;

public class PriorityQApp {
    public static void main(String[] args) throws Exception {
        PriorityQ thePQ = new PriorityQ(100);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            out.print(item + " ");
        }
        out.println();

        thePQ.insert(70);
        thePQ.insert(100);
        thePQ.insert(80);
        thePQ.insert(60);
        thePQ.insert(20);
        thePQ.display();
    }
}
