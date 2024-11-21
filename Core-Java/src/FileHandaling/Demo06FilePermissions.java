package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo06FilePermissions {
    public static void main(String[] args) throws IOException {
        String name = "xyz.txt"; // name or path
        File file = new File(name);
        boolean mkdir = file.createNewFile();
        System.out.println(" file is created "+ mkdir);
        file.setWritable(false);
        System.out.println("file only read");
        System.out.println(" write permission "+file.canWrite());
    }
}
