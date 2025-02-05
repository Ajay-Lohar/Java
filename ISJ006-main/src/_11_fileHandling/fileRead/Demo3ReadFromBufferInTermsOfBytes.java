package _11_fileHandling.fileRead;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3ReadFromBufferInTermsOfBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int content = bufferedInputStream.read();
        while (content != -1) {
            System.out.print((char) content);
            content = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
