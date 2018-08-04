package com.yasser;

public class Link {
    public int value;
    public Link next;

    public Link(int value, Link next) {
        this.value = value;
        this.next = next;
    }

    public Link(int value) {
        this.value = value;
    }
}
