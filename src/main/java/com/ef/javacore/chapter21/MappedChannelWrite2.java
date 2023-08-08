package main.java.com.ef.javacore.chapter21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite2 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel = null;
        ByteBuffer byteBuffer;

        try {
            fileOutputStream = new FileOutputStream("test.txt");
            fileChannel = fileOutputStream.getChannel();
            byteBuffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte) ('A' + i));
            }

            byteBuffer.rewind();
            fileChannel.write(byteBuffer);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fileChannel != null) fileChannel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
