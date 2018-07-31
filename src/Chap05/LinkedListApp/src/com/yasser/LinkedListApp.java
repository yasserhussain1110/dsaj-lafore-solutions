package com.yasser;

import static java.lang.System.out;

public class LinkedListApp {
    public static void main(String[] args) throws Exception {
        linkedList1Main();
        linkedList2Main();
    }

    public static void linkedList2Main() throws Exception {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.display();

        Link f = theList.find(44);
        if (f != null)
            out.println("Found link with key " + f.id);
        else
            out.println("Can't find link");

        Link d = theList.delete(66);
        if (d != null)
            out.println("Found link with key " + d.id);
        else
            out.println("Can't find link");

        theList.display();
    }

    public static void linkedList1Main() throws Exception {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.display();

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            out.print("Deleted ");
            aLink.display();
            out.println();
        }

        theList.display();
    }
}
