package _11_fileHandling.fileWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3BufferWriteInTermsBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        for (int i = 65; i <= 100; i++) {
            bufferedOutputStream.write((int) i);
        }
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation complete");
    }
}
