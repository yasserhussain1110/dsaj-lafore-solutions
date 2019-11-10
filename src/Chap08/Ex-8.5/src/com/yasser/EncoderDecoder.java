package com.yasser;

import java.util.Map;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class EncoderDecoder {
    public static String encode(HuffmanTree tree, String message) {
        Map<Character, String> encodingMap = tree.getEncodingMap();
        return stream(message.split("")).map(x -> encodingMap.get(x.charAt(0))).collect(joining());
    }

    public static String decode(HuffmanTree tree, String encoded) {
        String message = "";
        HuffmanTree current = tree;
        for (int i = 0; i < encoded.length(); i++) {
            char bit = encoded.charAt(i);
            if (bit == '0') {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            if (current.getLeft() == null && current.getRight() == null) {
                message += current.getLetter();
                current = tree;
            }
        }
        return message;
    }
}
