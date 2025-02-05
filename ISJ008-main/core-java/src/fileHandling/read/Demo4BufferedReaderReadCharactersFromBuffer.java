package fileHandling.read;

import java.io.*;

public class Demo4BufferedReaderReadCharactersFromBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int read = bufferedReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
