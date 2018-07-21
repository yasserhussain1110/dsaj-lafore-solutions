package com.yasser;

public class QueueApp {
    public static void main(String[] args) throws Exception {
        Queue theQueue = new Queue(5);     // queue holds 5 items

        theQueue.insert(10);                    // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();                         // remove 3 items
        theQueue.remove();                         //  (10, 20, 30)
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while(!theQueue.isEmpty()) {
            System.out.print(theQueue.remove());
            System.out.print(" ");
        }
        System.out.println();
    }
}
