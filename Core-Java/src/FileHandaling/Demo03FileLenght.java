package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo03FileLenght {
    public static void main(String[] args) throws IOException {
         String path = "abc1.txt"; // name or path

        File file = new File(path);
        boolean createNewFile = file.createNewFile();
        System.out.println(" file is created "+ createNewFile);
        System.out.println(" file lenght is  "+ file.length());
    }
}
