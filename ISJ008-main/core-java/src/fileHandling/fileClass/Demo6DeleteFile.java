package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo6DeleteFile {
    public static void main(String[] args) throws IOException {
        //delete a file
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\abc1.txt");
        System.out.println("file is deleted : " + file.delete());
    }
}
