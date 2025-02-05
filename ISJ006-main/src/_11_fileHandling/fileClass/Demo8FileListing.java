package _11_fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;

public class Demo8FileListing {
    public static void main(String[] args) {
        File folder  = new File("C:\\Work\\ISJ006\\src\\_7_array");
        String[] listOfAllFilesNames = folder.list((dir, name)->name.startsWith("Demo1"));
        for (String fileName:listOfAllFilesNames) {
            System.out.println(fileName);
        }
    }
}
