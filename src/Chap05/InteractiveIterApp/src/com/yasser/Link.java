package com.yasser;

import static java.lang.System.out;

public class Link {
    public int value;
    public Link next;

    public Link(int value) {
        this.value = value;
    }

    public void display() {
        out.print(value);
    }
}
