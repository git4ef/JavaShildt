package main.java.com.ef.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void runDirListOnly() {
        String dirname = "src";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("java");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
