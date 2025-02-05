package _11_fileHandling.fileWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2FileWriteInTermsCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("We are appending to the file");

        fileWriter.close();
        System.out.println("Write operation complete");
    }
}
