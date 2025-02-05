package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo9FilePermissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.setWritable(false);
        System.out.println("file permission update to read only");
    }
}
