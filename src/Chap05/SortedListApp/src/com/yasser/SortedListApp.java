package com.yasser;

public class SortedListApp {
    public static void main(String[] args) throws Exception {
        SortedList theSortedList = new SortedList();
        theSortedList.insert(20);
        theSortedList.insert(40);

        theSortedList.display();

        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.display();
        theSortedList.remove();

        theSortedList.display();

    }
}
