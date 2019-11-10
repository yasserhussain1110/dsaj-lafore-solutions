package com.yasser;

import static com.yasser.EncoderDecoder.decode;
import static com.yasser.EncoderDecoder.encode;
import static com.yasser.HuffmanTree.getTree;
import static java.lang.System.out;

public class HuffmanEncodingApp {
    public static void main(String[] args) {
        HuffmanTree tree = getTree("this is an example of a huffman tree");
        out.println(encode(tree, "rome"));
        out.println(decode(tree, encode(tree, "rome")));
        out.println(decode(tree, encode(tree, "from here on out")));
    }
}
