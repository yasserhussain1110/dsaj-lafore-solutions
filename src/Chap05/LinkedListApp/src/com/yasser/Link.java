package com.yasser;

import static java.lang.System.out;

public class Link {
    public int id;
    public double value;
    public Link next;

    public Link(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public void display() {
        out.print(String.format("{ %s, %s }", id, value));
    }
}
