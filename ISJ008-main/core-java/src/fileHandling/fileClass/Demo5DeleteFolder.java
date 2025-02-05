package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFolder {
    public static void main(String[] args) throws IOException {
        //delete a folder
        File folder = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\folder1");
        System.out.println("Folder is deleted : " + folder.delete());
    }
}
