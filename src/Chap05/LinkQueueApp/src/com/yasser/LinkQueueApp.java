package com.yasser;

public class LinkQueueApp {
    public static void main(String[] args) throws Exception {
        LinkQueue theQueue = new LinkQueue();
        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.display();

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.display();

        theQueue.remove();
        theQueue.remove();

        theQueue.display();
    }
}
