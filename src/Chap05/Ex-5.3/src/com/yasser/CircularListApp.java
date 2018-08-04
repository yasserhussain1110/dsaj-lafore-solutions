package com.yasser;

import static java.lang.System.out;

public class CircularListApp {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.display();
        list.delete();
        list.insert(1);
        list.display();
        list.delete();
        list.display();
        list.insert(3);
        list.display();
        list.insert(4);
        list.display();
        list.step();
        list.display();
        list.delete();
        list.display();
        out.println(list.search(3));
        out.println(list.search(4));
    }
}
