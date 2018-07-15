package com.yasser;

public class InsertSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr = new ArrayIns(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.insertionSort();

        arr.display();

        System.out.println("Ex-3.2");
        System.out.println(arr.median());

        System.out.println("Ex-3.3");
        arr = new ArrayIns(maxSize);
        arr.insert(22);
        arr.insert(33);
        arr.insert(54);
        arr.insert(77);
        arr.insert(22);
        arr.insert(54);
        arr.insert(33);
        arr.insert(77);
        arr.insert(99);
        arr.insert(97);
        arr.insert(10);
        arr.insert(33);
        arr.insert(22);
        arr.insert(33);

        arr.insertionSort();
        arr.display();
        arr.noDups();
        arr.display();
    }
}
