package fileHandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReaderReadCharactersFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileReader.read();
        }
        fileReader.close();
    }
}
