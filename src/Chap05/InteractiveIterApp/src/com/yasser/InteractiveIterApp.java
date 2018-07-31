package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class InteractiveIterApp {
    public static void main(String[] args) throws Exception {
        // main1();
        main2();
    }

    public static void main1() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        LinkedList theList = new LinkedList();
        ListIterator iter1 = theList.getIterator();

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (true) {
            out.print("Enter first letter of show, reset, ");
            out.print("next, get, before, after delete: ");
            String input = in.readLine();
            int choice = input.length() == 0 ? 0 : input.charAt(0);
            int value;
            switch (choice) {
                case 's':
                    if (theList.isEmpty()) {
                        out.println("List is empty");
                    } else {
                        theList.display();
                    }
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    iter1.nextLink();
                    break;
                case 'g':
                    if (theList.isEmpty()) {
                        out.println("List is empty");
                    } else {
                        out.println("Returned " + iter1.getCurrent().value);
                    }
                    break;
                case 'b':
                    out.print("Enter value to insert: ");
                    value = Integer.parseInt(in.readLine().trim());
                    iter1.insertBefore(value);
                    break;
                case 'a':
                    out.print("Enter value to insert: ");
                    value = Integer.parseInt(in.readLine().trim());
                    iter1.insertAfter(value);
                    break;
                case 'd':
                    if (theList.isEmpty()) {
                        out.println("List is empty");
                    } else {
                        value = iter1.deleteCurrent();
                        out.println("Deleted " + value);
                    }
                    break;
                default:
                    out.println("Invalid entry");
            }
        }
    }

    public static void main2() throws Exception {
        LinkedList theList = new LinkedList();
        ListIterator iter1 = theList.getIterator();

        iter1.insertAfter(21);
        iter1.insertAfter(40);
        iter1.insertAfter(30);
        iter1.insertAfter(7);
        iter1.insertAfter(45);

        theList.display();

        iter1.reset();
        Link aLink = iter1.getCurrent();
        if (aLink.value % 3 == 0) {
            iter1.deleteCurrent();
        }

        while (!iter1.atEnd()) {
            iter1.nextLink();
            aLink = iter1.getCurrent();
            if (aLink.value % 3 == 0)
                iter1.deleteCurrent();
        }
        theList.display();
    }
}
