package main.java.com.ef.javacore.chapter21;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelWrite3 {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;
        ByteBuffer byteBuffer;

        try {
            randomAccessFile = new RandomAccessFile("text.txt", "rw");
            fileChannel = randomAccessFile.getChannel();
            byteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        } finally {
            try {
                if (fileChannel != null) fileChannel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }

            try {
                if (randomAccessFile != null) randomAccessFile.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
