package main.java.com.ef.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void runDirList() {
        String dirname = "src";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Directory: " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is directory");
                } else {
                    System.out.println(s[i] + " is file");
                }
            }
        } else {
            System.out.println(dirname + " is not directory");
        }
    }
}
