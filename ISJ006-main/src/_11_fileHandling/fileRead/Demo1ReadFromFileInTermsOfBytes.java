package _11_fileHandling.fileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1ReadFromFileInTermsOfBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content = fileInputStream.read();
        while (content != -1) {
            System.out.print((char) content);
            content = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
