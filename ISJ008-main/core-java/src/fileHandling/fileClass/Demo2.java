package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //create a new file
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\abc.txt");
        System.out.println("File is created : " + file.createNewFile());
    }
}
