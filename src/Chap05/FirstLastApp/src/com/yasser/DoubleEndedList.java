package com.yasser;

public class DoubleEndedList {
    private Link first, last;

    public DoubleEndedList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        Link link = new Link(value);
        if (isEmpty()) first = last = link;
        else {
            link.next = first;
            first = link;
        }
    }

    public void insertLast (int value) {
        Link link = new Link(value);
        if (isEmpty()) first = last = link;
        else {
            last.next = link;
            last = link;
        }
    }

    public Link deleteFirst () {
        if (isEmpty()) return null;
        Link link = first;
        first = first.next;
        return link;
    }

    public void displayList () {
        System.out.print("List (first-->last): ");
        for (Link i = first; i != null; i = i.next) {
            i.display();
            System.out.print(" ");
        }
        System.out.println();
    }
}
