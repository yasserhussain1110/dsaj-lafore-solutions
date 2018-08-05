package com.yasser;

public class PriorityQueue {
    private SortedList list;

    public PriorityQueue() {
        list = new SortedList();
    }

    public void insert(int value) {
        list.insert(value);
    }

    public int remove() throws Exception {
        return list.remove();
    }

    public int peekMin() throws Exception {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
