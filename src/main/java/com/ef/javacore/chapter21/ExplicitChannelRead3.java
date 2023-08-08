package main.java.com.ef.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelRead3 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileChannel fileChannel = null;
        ByteBuffer mBuf;
        int count;

        try {
            fileInputStream = new FileInputStream("test.txt");

            fileChannel = fileInputStream.getChannel();

            mBuf = ByteBuffer.allocate(128);

            do {
                count = fileChannel.read(mBuf);

                if (count != -1) {
                    mBuf.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();


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
