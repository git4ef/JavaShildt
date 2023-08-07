package main.java.com.ef.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void runFileDemo() {
        File f1 = new File("src/Main.java");
        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent path: " + f1.getParent());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "can write" : "can't write");
        p(f1.canRead() ? "can read" : "can't read");
        p(f1.isDirectory() ? "is directory" : "is not directory");
        p(f1.isFile() ? "is file" : "is not file");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("last modified: " + f1.lastModified());
        p("size: " + f1.length() + " byte");
    }
}
