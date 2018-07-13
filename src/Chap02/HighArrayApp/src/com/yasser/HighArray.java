package com.yasser;

public class HighArray {
    private Integer[] array;
    private int currentPosition;

    public HighArray(int maxArraySize) {
        array = new Integer[maxArraySize];
        currentPosition = 0;
    }

    public int getSize() {
        return currentPosition;
    }

    public void insert(int num) {
        array[currentPosition++] = num;
    }

    public void display() {
        for (int i = 0; i < currentPosition; i++) {
            System.out.println(array[i]);
        }
    }

    private int findKey(int searchKey) {
        for (int i = 0; i < currentPosition; i++) {
            if (searchKey == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean find(int searchKey) {
        return findKey(searchKey) > -1;
    }

    public boolean delete(int value) {
        int valueIndex = findKey(value);
        if (valueIndex == -1) return false;
        for (int i = valueIndex; i < currentPosition - 1; i++) {
            array[i] = array[i + 1];
        }
        currentPosition--;
        return true;
    }

    public int removeMax() {
        int maxIndex = getMaxIndex();
        int maxValue = array[maxIndex];
        for (int i = maxIndex; i < currentPosition - 1; i++) {
            array[i] = array[i + 1];
        }
        currentPosition--;
        return maxValue;
    }

    private int getMaxIndex() {
        if (currentPosition == 0) return -1;

        int maxValueIndex = 0;

        for (int i = 1; i < currentPosition; i++) {
            if (array[maxValueIndex] < array[i]) {
                maxValueIndex = i;
            }
        }
        return maxValueIndex;
    }

    public int getMax() {
        if (currentPosition == 0) return -1;
        return array[getMaxIndex()];
    }

    public void noDups() {
        int numberOfDups = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == null) continue;
                if (array[j] == array[i]) {
                    numberOfDups++;
                    array[j] = null;
                }
            }
        }

        Integer[] noDupsArray = new Integer[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                noDupsArray[j++] = array[i];
            }
        }
        array = noDupsArray;
        currentPosition -= numberOfDups;
    }
}

