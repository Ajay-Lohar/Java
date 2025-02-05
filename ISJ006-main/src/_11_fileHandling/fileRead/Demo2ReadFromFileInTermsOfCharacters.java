package _11_fileHandling.fileRead;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2ReadFromFileInTermsOfCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\_1_introduction\\HelloWorld.java");
        FileReader fileReader = new FileReader(file);
        int content = fileReader.read();
        while (content != -1) {
            System.out.print((char) content);
            content = fileReader.read();
        }
        fileReader.close();
    }
}
