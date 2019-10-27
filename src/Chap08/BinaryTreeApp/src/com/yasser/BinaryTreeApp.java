package com.yasser;

import static java.lang.System.out;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree bTree = getBasicBinaryTree();
        bTree.display();
        findDemo();
        balanceDemo();
        deleteDemo();
    }

    private static void findDemo() {
        BinaryTree bTree = getBasicBinaryTree();
        out.println(bTree.find(122));
        out.println(bTree.find(12));
        out.println(bTree.find(55));
    }

    private static void balanceDemo() {
        BinaryTree bTree = getBasicBinaryTree();
        out.println(bTree.depth());
        bTree.balance();
        out.println(bTree.depth());
    }

    private static void deleteDemo() {
        BinaryTree bTree = getBasicBinaryTree();
        bTree.delete(126);
        bTree.delete(30);
        bTree.display();
        bTree.delete(12);
        bTree.display();
        bTree.delete(1);
        bTree.display();
        bTree.delete(1024);
        bTree.display();
    }

    private static BinaryTree getBasicBinaryTree() {
        BinaryTree bTree = new BinaryTree();
        bTree.insert(50);
        bTree.insert(22);
        bTree.insert(77);
        bTree.insert(95);
        bTree.insert(122);
        bTree.insert(12);
        bTree.insert(30);
        bTree.insert(201);
        bTree.insert(304);
        bTree.insert(126);
        bTree.insert(256);
        bTree.insert(1024);
        return bTree;
    }
}
