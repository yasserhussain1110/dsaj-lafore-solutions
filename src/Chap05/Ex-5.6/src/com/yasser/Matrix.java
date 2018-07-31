package com.yasser;

import static java.lang.System.out;

public class Matrix {
    private Link start;

    public Matrix(int row, int col) {
        Link[] linkArray = new Link[row];
        for (int i = 0; i < row; i++) {
            linkArray[i] = createLinkRowOfLength(col);
        }

        start = linkArray[0];

        while (linkArray[0] != null) {
            for (int i = 0; i < linkArray.length; i++) {
                if (i == 0) continue;
                linkArray[i - 1].down = linkArray[i];
            }

            for (int i = 0; i < linkArray.length; i++) {
                linkArray[i] = linkArray[i].left;
            }
        }
    }

    private Link createLinkRowOfLength(int col) {
        Link current = null;
        for (int i = 0; i < col; i++) {
            Link link = new Link(0);
            if (i != 0)
                link.left = current;
            current = link;

        }
        return current;
    }

    public void display() {
        for (Link j = start; j != null; j = j.down) {
            for (Link i = j; i != null; i = i.left) {
                out.print(i.value);
                out.print(" ");
            }
            out.println();
        }
        out.println();
    }

    public void insert(int row, int col, int value) {
        Link current = start;
        for (int i = 0; i < row; i++) current = current.down;
        for (int i = 0; i < col; i++) current = current.left;
        current.value = value;
    }
}
