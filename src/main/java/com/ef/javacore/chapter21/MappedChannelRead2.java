package main.java.com.ef.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


public class MappedChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        long fSize;
        MappedByteBuffer mappedByteBuffer;

        try {
            fileInputStream = new FileInputStream("test.txt");
            fileChannel = fileInputStream.getChannel();
            fSize = fileChannel.size();
            mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.println((char) mappedByteBuffer.get());
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fileChannel != null) fileChannel.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала");
            }
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
