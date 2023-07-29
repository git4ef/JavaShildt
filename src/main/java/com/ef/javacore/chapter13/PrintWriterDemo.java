package main.java.com.ef.javacore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void runPrintWriterDemo() {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("this string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
