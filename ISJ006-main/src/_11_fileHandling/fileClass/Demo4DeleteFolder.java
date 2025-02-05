package _11_fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo4DeleteFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("02012024");
        System.out.println("Folder Delete " + folder.delete());
    }
}
