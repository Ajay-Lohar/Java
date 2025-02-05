package _11_fileHandling.fileClass;

import java.io.File;
import java.io.FileFilter;

public class Demo12FileObjectListing {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\sande\\Downloads");
        FileFilter filter = (file) -> file.getName().endsWith(".pdf");
        File[] files = folder.listFiles(filter);
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }
    }
}
