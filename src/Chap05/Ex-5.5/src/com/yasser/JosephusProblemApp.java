package com.yasser;

import static java.lang.System.out;

public class JosephusProblemApp {
    private static final int JOSEPHUS_POSITION = 7;

    public static void main(String[] args) throws Exception {
        JosephusSimulator sim;

        sim = new JosephusSimulator(7, 3, 1);
        sim.simulate();
        out.println();

        for (int i = 1; i <= 20; i++) {
            out.println("Count off number - " + i);
            sim = new JosephusSimulator(20, i, 1);
            sim.simulate();
            out.println(String.format("Remaining - %s", sim.getCurrentPersonPosition()));
            if (sim.getCurrentPersonPosition() == JOSEPHUS_POSITION) {
                out.print("Josephus should choose countOffNumber - ");
                out.println(i);
                break;
            }
            out.println();
        }
    }
}
