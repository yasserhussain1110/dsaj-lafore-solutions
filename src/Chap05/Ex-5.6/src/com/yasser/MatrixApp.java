package com.yasser;

public class MatrixApp {
    public static void main(String[] args) {
        Matrix m = new Matrix(7, 10);
        m.display();
        m.insert(3, 5, 10);
        m.display();
    }
}
