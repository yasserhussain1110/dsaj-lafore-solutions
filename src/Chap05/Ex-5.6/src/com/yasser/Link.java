package com.yasser;

public class Link {
    public int value;
    public Link left;
    public Link down;

    public Link(int value) {
        this.value = value;
        this.left = null;
        this.down = null;
    }
}
