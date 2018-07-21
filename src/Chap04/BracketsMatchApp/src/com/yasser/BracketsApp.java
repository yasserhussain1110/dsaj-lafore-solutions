package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class BracketsApp {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String word = in.readLine();
            if ("".equals(word)) break;
            BracketsChecker checker = new BracketsChecker(word);
            out.println(checker.check());
        }
    }
}
