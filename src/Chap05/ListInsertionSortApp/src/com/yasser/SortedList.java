package com.yasser;

import static java.lang.System.out;

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public SortedList (int[] numArray) {
        this();
        for (int num : numArray) {
            insert(num);
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int value) {
        Link link = new Link(value);
        if (isEmpty() || first.value >= value) {
            link.next = first;
            first = link;
            return;
        } else if (first.next == null) {
            first.next = link;
            return;
        }

        Link i;
        for (i = first; i.next != null; i = i.next) {
            if (i.next.value >= value) {
                break;
            }
        }

        link.next = i.next;
        i.next = link;
    }

    public void display () {
        out.print("List (first-->last): ");
        for (Link i = first; i != null; i = i.next) {
            out.print(i.value);
            out.print(" ");
        }
        out.println();
    }

    public int remove() throws Exception{
        if (isEmpty()) throw new Exception("List empty");
        Link link = first;
        first = first.next;
        return link.value;
    }
}
