package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo04DeleteFolder {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Practice\\Java\\Core-Java\\src\\abc"; // name or path
        File folder = new File(path);
        boolean deleteFolder = folder.delete();

        System.out.println(" folder is delete "+ deleteFolder);
    }
}
