package main.java.com.ef.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void runBRRead() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbols, q = for quit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
