package com.yasser;

import static java.lang.System.out;

public class JosephusSimulator {
    private CircularList list;
    private int countOffNumber;

    public JosephusSimulator(int numberOfPeople, int countOffNumber, int startingPoint) {
        list = new CircularList();
        for (int i = 1; i <= numberOfPeople; i++) {
            list.insert(i);
        }
        list.stepN(startingPoint);
        this.countOffNumber = countOffNumber;
    }

    private int killNextVictim() throws Exception {
        list.stepN(countOffNumber);
        int val = list.getCurrentValue();
        list.delete();
        return val;
    }

    public void simulate() throws Exception {
        while (!list.isOneRemaining()) {
            out.print(killNextVictim());
            out.print(" ");
        }
        out.println();
    }

    public int getCurrentPersonPosition() throws Exception {
        return list.getCurrentValue();
    }
}
