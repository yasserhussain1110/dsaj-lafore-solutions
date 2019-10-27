package com.yasser;

/**
 * This Binary Tree implementation always creates a complete
 * tree. It accomplishes this by tracking index of characters
 * getting added to a binary tree.
 *
 * Given index of an element in a binary tree, it is possible
 * to traverse to that node in O(log(N)) time. This implementation uses
 * this info.
 *
 * Indexes start from 1. Example BTree schema -
 *
 *
 *
 *
 *                                    -------
 *                                    |  1  |
 *                                    -------
 *                                   /        \
 *                                  /         \
 *                                 /          \
 *                               -----       -----
 *                               | 2 |       | 3 |
 *                               -----       -----
 *                              /    \
 *                             /     \
 *                            /      \
 *                          -----   -----
 *                          | 4 |   | 5 |
 *                          -----   -----   ......
 */
public class CompleteBTree {
    private Node start;
    private int size = 0;

    public void add(char letter) {
        Node newNode = new Node(letter);
        if (start == null) {
            start = newNode;
            ++size;
        } else {
            Node.add(start, newNode, ++size);
        }
    }


    public void display() {
        Node.display(start);
    }

    public int level() {
        return Node.level(start);
    }
}

