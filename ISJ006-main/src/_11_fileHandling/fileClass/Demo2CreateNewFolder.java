package _11_fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo2CreateNewFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("02012024");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Folder created " + isFolderCreated);
    }
}
