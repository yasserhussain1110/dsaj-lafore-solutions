package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class ReverseApp {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            out.print("Enter a string: ");
            String word = in.readLine();
            if ("".equals(word)) break;
            String reversed = reverse(word);
            out.println("Revered: "+reversed);
        }
    }

    public static String reverse(String input) throws Exception {
        StackX<Character> theStack = new StackX<Character>(input.length());
        for (int i = 0; i < input.length(); i++) {
            theStack.push(input.charAt(i));
        }

        String rev = "";
        while (!theStack.isEmpty()) rev += theStack.pop();
        return rev;
    }
}
