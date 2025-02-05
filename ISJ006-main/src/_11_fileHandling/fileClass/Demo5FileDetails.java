package _11_fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo5FileDetails {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("File created " + file.createNewFile());
        System.out.println("path "+file.getAbsolutePath());
        System.out.println("Length of File "+file.length());
        System.out.println("Is it file "+file.isFile());
    }
}
