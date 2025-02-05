package _11_fileHandling.fileClass;

import java.io.File;
import java.io.FileFilter;

public class Demo11FileObjectListing {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ006\\src\\_7_array");
        FileFilter filter = (file) -> file.length() < 300;
        File[] files = folder.listFiles(filter);
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }
    }
}
