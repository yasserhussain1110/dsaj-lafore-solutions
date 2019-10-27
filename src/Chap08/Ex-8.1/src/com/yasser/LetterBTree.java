package com.yasser;

public class LetterBTree {
    private Node start;

    public void add(String letters) {
        for (int i = 0; i < letters.length(); i++) {
            add(letters.charAt(i));
        }
    }

    private void add(char letter) {
        Node newNode = new Node(letter);
        if (start == null) {
            start = newNode;
        } else {
            start = new Node('+', start, newNode);
        }
    }

    public void display() {
        Node.display(start);
    }
}
