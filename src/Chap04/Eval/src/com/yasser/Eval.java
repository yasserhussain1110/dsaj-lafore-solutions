package com.yasser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Eval {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        out.println("===Tests===");
        test();
        out.println("===Test===");
        while (true) {
            out.print("Enter expression: ");
            String input = in.readLine();
            if ("".equals(input)) break;
            out.println(eval(input));
        }
    }

    public static void test() throws Exception{
        out.println(eval("1+(2*5)-2+7*(2+3)"));
        out.println(eval("9-6-1"));
        out.println(eval("3*(4 / (5 - 1)) + 7"));
        out.println(eval("1 + 2"));
        out.println(eval("1 + 2 * 3"));
        out.println(eval("(1 + 2) * 3"));
        out.println(eval("(2 + 3) * 4"));
        out.println(eval("(1 + (5 + 6) * 7) * 3"));
        out.println(eval("2 - (1 + (5 + 6) * 7) / 8 * 3"));

    }

    public static double eval(String input) throws Exception {
        String postfix = new InToPost(input).doTrans();
        return new ParsePost(postfix).doParse();
    }
}
