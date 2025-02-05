package fileHandling.fileClass;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo12FileObjectListing {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ008\\core-java\\src\\exceptionHandling");
        FilenameFilter filenameFilter=(file, name)->name.startsWith("Demo1");
        File[] files = folder.listFiles(filenameFilter);
        for (File file:files){
            System.out.println(file.getName()+"\t"+file.length()+"\t"+file.getAbsolutePath());
        }
    }
}
