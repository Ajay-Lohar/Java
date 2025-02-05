package fileHandling.fileClass;

import java.io.File;
import java.io.FileFilter;

public class Demo14FileObjectListingFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ008\\core-java\\src\\exceptionHandling");
        FileFilter fileFilter = (file) -> file.length() > 500;
        File[] files = folder.listFiles(fileFilter);
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }
    }
}
