package com.yasser;

import static java.lang.System.out;

public class CircularList {
    private Link current;

    public CircularList() {
        current = null;
    }

    public boolean isEmpty() {
        return current == null;
    }

    public void insert(int value) {
        Link newLink = new Link(value);
        if (isEmpty()) {
            current = newLink;
            current.next = current;
        } else {
            newLink.next = current.next;
            current.next = newLink;
        }
    }

    public boolean search(int value) {
        if (isEmpty()) return false;
        if (current.value == value) return true;
        for (Link i = current.next; i != current; i = i.next) {
            if (i.value == value) {
                return true;
            }
        }
        return false;
    }

    public int delete() throws Exception {
        if (isEmpty()) throw new Exception("List empty");
        int value = current.next.value;
        // if there is 1 item
        if (current == current.next) {
            current = null;
        } else {
            current.next = current.next.next;
        }
        return value;
    }

    public void display() {
        out.print("Circular List - ");
        if (!isEmpty()) {
            out.print(current.value + " ");
            for (Link i = current.next; i != current; i = i.next) {
                out.print(i.value + " ");
            }
        }
        out.println();
    }

    public void step() {
        if (isEmpty()) return;
        current = current.next;
    }
}
