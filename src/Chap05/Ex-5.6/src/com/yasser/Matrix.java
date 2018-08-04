package com.yasser;

import static java.lang.System.out;

public class Matrix {
    private Link start;

    public Matrix(int row, int col) {
        Link[][] matrix = new Link[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = new Link(0);
                if (i != 0) {
                    matrix[i - 1][j].down = matrix[i][j];
                }
                if (j != 0) {
                    matrix[i][j - 1].left = matrix[i][j];
                }
            }
        }
        start = matrix[0][0];
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
