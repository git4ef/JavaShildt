package main.java.com.ef.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src";

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Каталог " + dirname);

            for (Path entry : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()) System.out.print("<DIR> ");
                else System.out.println("      ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException у) {
            System.out.println(dirname + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
