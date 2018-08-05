package com.yasser;

public class Link {
    public int value;
    public Link next;
    public Link prev;

    public Link(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
