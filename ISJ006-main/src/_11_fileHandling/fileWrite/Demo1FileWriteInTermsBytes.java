package _11_fileHandling.fileWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1FileWriteInTermsBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        for (int i = 1; i <= 100; i++) {
            fileOutputStream.write((int) i);
        }
        fileOutputStream.close();
        System.out.println("Write operation complete");
    }
}
