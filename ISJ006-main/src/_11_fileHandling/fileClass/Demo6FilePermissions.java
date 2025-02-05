package _11_fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo6FilePermissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //set the permission
        file.setWritable(false);
        System.out.println("Permission set to readable");
    }
}
