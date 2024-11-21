package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo02CreateFolder{
    public static void main(String[] args) throws IOException {
         String name = "xyz"; // name or path

        File file = new File(name);
        boolean mkdir = file.mkdir();
        System.out.println(" file is created "+ mkdir);
    }
}
