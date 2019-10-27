package com.yasser;

public class Utils {
    public static int numberOfPlus(int n) {
        int log = (int) Math.ceil(Math.log(n) / Math.log(2));
        return (int) Math.pow(2, log) - 1;
    }
}
