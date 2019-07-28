package com.yasser;

import static java.lang.System.out;

public class PowerApp {
    public static void main(String[] args) {
        out.println(pow(2, 5));
        out.println(pow(3, 4));
        out.println(pow(2, 7));
        out.println(pow(2, 15));
    }

    private static int pow(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b % 2 == 0) {
            int aHalfB = pow(a, b / 2);
            return aHalfB * aHalfB;
        } else if (b % 3 == 0) {
            int aOneThirdB = pow(a, b / 3);
            return aOneThirdB * aOneThirdB * aOneThirdB;
        } else {
            return a * pow(a, b - 1);
        }
    }
}
