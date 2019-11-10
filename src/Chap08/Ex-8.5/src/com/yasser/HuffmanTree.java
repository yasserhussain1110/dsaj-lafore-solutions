package com.yasser;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

public class HuffmanTree {
    private int frequency;

    private char letter;

    private HuffmanTree left;

    private HuffmanTree right;

    private Map<Character, String> encodingMap;

    public HuffmanTree(int frequency, char letter) {
        this.frequency = frequency;
        this.letter = letter;
    }

    public HuffmanTree(HuffmanTree left, HuffmanTree right) {
        this.left = left;
        this.right = right;
        this.frequency = left.frequency + right.frequency;
    }

    public HuffmanTree getLeft() {
        return left;
    }

    public HuffmanTree getRight() {
        return right;
    }

    public char getLetter() {
        return letter;
    }

    public int getFrequency() {
        return frequency;
    }

    public Map<Character, String> getEncodingMap() {
        if (encodingMap == null) {
            encodingMap = new HashMap<>();
            addToEncodingMap(encodingMap, "", this);
        }
        return encodingMap;
    }

    public static HuffmanTree getTree(String message) {
        Map<Character, Integer> frequencyMap = getFrequencyMap(message);
        PriorityQueue<HuffmanTree> queue = new PriorityQueue<>(comparingInt(HuffmanTree::getFrequency));
        queue.addAll(
                frequencyMap
                        .entrySet()
                        .stream()
                        .map(x -> new HuffmanTree(x.getValue(), x.getKey()))
                        .collect(toList()));

        return mergeTrees(queue);
    }

    public static HuffmanTree mergeTrees(PriorityQueue<HuffmanTree> queue) {
        while (queue.size() > 1) {
            HuffmanTree tree1 = queue.remove();
            HuffmanTree tree2 = queue.remove();
            HuffmanTree combined = new HuffmanTree(tree1, tree2);
            queue.add(combined);
        }
        return queue.remove();
    }

    private static Map<Character, Integer> getFrequencyMap(String message) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            int oldCount = frequencyMap.getOrDefault(letter, 0);
            frequencyMap.put(letter, oldCount + 1);
        }
        return frequencyMap;
    }

    private static void addToEncodingMap(Map<Character, String> map, String partialMessage, HuffmanTree tree) {
        if (tree.right == null && tree.left == null) {
            map.put(tree.letter, partialMessage);
        } else {
            addToEncodingMap(map, partialMessage + "0", tree.left);
            addToEncodingMap(map, partialMessage + "1", tree.right);
        }
    }
}
