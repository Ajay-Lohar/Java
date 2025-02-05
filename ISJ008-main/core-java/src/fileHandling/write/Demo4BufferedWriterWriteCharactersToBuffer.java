package fileHandling.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4BufferedWriterWriteCharactersToBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //will append the content at the end of file
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("we can write multiple strings using file writer");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("file content written");
    }
}
