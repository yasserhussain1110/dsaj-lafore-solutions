package com.yasser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class InfixApp {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            out.print("Enter infix: ");
            String input = in.readLine();
            if ("".equals(input)) {
                break;
            }
            InToPost transformer = new InToPost(input);
            out.println(transformer.doTrans());
        }
    }
}
