package _11_fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo3DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("File Delete " + file.delete());
    }
}
