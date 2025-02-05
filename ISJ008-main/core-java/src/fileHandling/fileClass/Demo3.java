package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 200; i++) {
            //create a new file
            File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\abc" + i + ".txt");
            System.out.println("File is created : " + file.createNewFile());
        }
    }
}
