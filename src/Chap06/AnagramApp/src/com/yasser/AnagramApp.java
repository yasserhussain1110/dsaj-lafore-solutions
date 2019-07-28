package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;

public class AnagramApp {
    public static void main(String[] args) throws Exception {
        String inputWord = getString().trim();
        char[] word = new char[inputWord.length()];

        for (int i = 0; i < word.length; i++) {
            word[i] = inputWord.charAt(i);
        }

        printAnagrams(word);
    }

    private static void printAnagrams(char[] word) {
        doAnagram(word, word.length);
    }

    private static void doAnagram(char[] word, int size) {
        if (size == 1) {
            display(word);
            return;
        }

        for (int i = 0; i < size; i++) {
            doAnagram(word, size - 1);
            rotate(word, size);
        }
    }

    private static void rotate(char[] word, int size) {
        int startPosForRotate = word.length - size;
        char temp = word[startPosForRotate];
//        System.arraycopy(word, startPosForRotate + 1, word, startPosForRotate, size - 1);
        for (int i = startPosForRotate + 1; i < word.length; i++)
            word[i - 1] = word[i];
        word[word.length - 1] = temp;
    }

    private static void display(char[] word) {
        out.println(word);
    }

    private static String getString() throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(in));
        return b.readLine();
    }
}
