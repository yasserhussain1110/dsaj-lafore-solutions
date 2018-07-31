package com.yasser;

public class ListIterator {
    private LinkedList theList;
    private Link previous;
    private Link current;

    public ListIterator(LinkedList theList) {
        this.theList = theList;
        previous = null;
        current = theList.getFirst();
    }

    public void reset() {
        previous = null;
        current = theList.getFirst();
    }

    public void nextLink() throws Exception {
        if (theList.isEmpty()) throw new Exception("List empty");
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return current.next == null;
    }

    public void insertAfter(int value) {
        Link link = new Link(value);
        if (theList.isEmpty()) {
            theList.setFirst(link);
        } else {
            link.next = current.next;
            current.next = link;
        }
        previous = current;
        current = link;
    }

    public void insertBefore(int value) {
        Link link = new Link(value);
        if (theList.isEmpty()) {
            theList.setFirst(link);
        } else {
            link.next = current;
            if (previous == null) {
                theList.setFirst(link);
            } else {
                previous.next = link;
            }
        }
        current = link;
    }

    public int deleteCurrent() {
        int value = current.value;
        if (current == theList.getFirst()) {
            theList.setFirst(current.next);
            current = current.next;
        } else if(current.next == null) {
            previous.next = null;
            current = theList.getFirst();
            previous = null;
        } else {
            previous.next = current.next;
            current = current.next;
        }
        return value;
    }


}
