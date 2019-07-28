package com.yasser;

import static java.lang.System.out;

public class Mult {
    public static void main(String[] args) {
        out.println(mult(2, 3));
        out.println(mult(5, 3));
        out.println(mult(7, 4));
    }

    private static int mult (int x, int y) {
        if (y == 1) {
            return x;
        } else if (x == 1) {
            return y;
        } else {
            return x + mult(x, y - 1);
        }
    }
}
