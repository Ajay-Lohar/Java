package _11_fileHandling.fileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4BufferWriteInTermsCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(". Writing using BufferedWriter");

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation complete");
    }
}
