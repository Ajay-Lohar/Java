package fileHandling.read;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3BufferedInputStreamReadBytesFromBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int read = bufferedInputStream.read();
        while (read != -1) {
            System.out.print((char) read);
            read = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
