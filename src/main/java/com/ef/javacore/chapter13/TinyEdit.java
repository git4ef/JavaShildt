package main.java.com.ef.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void runTinyEdit() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("enter string");
        System.out.println("enter 'stop' for quit");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop"))
                break;
        }
        System.out.println("\nFile content:");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}

