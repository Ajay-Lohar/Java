package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo7DeleteFile {
    public static void main(String[] args) throws IOException {
        //delete a file
        for (int i = 2; i <= 200; i++) {
            File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\abc" + i + ".txt");
            System.out.println("file is deleted : " + file.delete());
        }
    }
}
