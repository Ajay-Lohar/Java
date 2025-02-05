package _11_fileHandling.fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4ReadFromBufferInTermsOfCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\_1_introduction\\HelloWorld.java");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int content = bufferedReader.read();
        while (content != -1) {
            System.out.print((char) content);
            content = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
