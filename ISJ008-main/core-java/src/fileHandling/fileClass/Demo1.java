package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //create a new file
        File file = new File("abc.txt");
        System.out.println("File is created : " + file.createNewFile());
    }
}
