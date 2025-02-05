package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo4CreateFolder {
    public static void main(String[] args) throws IOException {
        //create a new folder
        File folder = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling\\folder1");
        System.out.println("Folder is created : " + folder.mkdir());
    }
}
