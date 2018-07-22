package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PostfixApp {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter postfix: ");
            String input = in.readLine();
            if ("".equals(input)) break;
            ParsePost p = new ParsePost(input);
            System.out.println(p.doParse());
        }
    }
}
