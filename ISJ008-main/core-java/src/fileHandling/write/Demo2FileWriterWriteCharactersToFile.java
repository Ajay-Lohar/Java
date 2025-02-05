package fileHandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2FileWriterWriteCharactersToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //will append the content at the end of file
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("we can write multiple strings using file writer");
        fileWriter.close();
        System.out.println("file content written");
    }
}
