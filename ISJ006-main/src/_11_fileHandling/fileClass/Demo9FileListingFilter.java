package _11_fileHandling.fileClass;

import java.io.File;

public class Demo9FileListingFilter {
    public static void main(String[] args) {
        File folder  = new File("C:\\Work\\ISJ006\\src\\_7_array");
        String[] listOfAllFilesNames = folder.list();
        for (String fileName:listOfAllFilesNames) {
            System.out.println(fileName);
        }
    }
}
