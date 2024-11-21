package FileHandaling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo13ReadBytesFromFiles {
    public static void main(String[] args) throws IOException {
        // File input stream  thise file path
        String path = "D:\\Practice\\Java\\Core-Java\\src\\FileHandaling\\Demo13ReadBytesFromFiles.java";

        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        int input = fileInputStream.read();

        while (input != -1) {
            System.out.print((char) input);
            input = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
