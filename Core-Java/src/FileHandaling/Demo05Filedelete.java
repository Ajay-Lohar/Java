package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo05Filedelete {
    public static void main(String[] args) throws IOException {
        String path = "abc1.txt"; // name or path
        File file = new File(path);
        boolean deleteFile = file.delete();
        System.out.println(" file is created "+ deleteFile);
    }
}
