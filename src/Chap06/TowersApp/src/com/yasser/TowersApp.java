package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;

public class TowersApp {
    public static void main(String[] args) throws Exception {
        out.println("Enter number of disks -");
        int n = getNumberOfDisks();
        doTowers(n, 1, 3);
    }

    private static void doTowers(int n, int fromTower, int toTower) {
        if (n == 1) {
            out.println("Move disk " + 1 + " from tower " + fromTower + " to " + toTower);
        } else {
            doTowers(n - 1, fromTower, 6 - (fromTower + toTower));
            out.println("Move disk " + n + " from tower " + fromTower + " to " + toTower);
            doTowers(n - 1, 6 - (fromTower + toTower), toTower);
        }
    }

    private static int getNumberOfDisks() throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(in));
        return Integer.parseInt(b.readLine().trim());
    }


}
