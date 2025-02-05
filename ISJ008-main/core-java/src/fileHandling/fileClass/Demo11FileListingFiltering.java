package fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;

public class Demo11FileListingFiltering {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ008\\core-java\\src\\exceptionHandling");

        //get file names whose name starts with Demo1 from the folder
        FilenameFilter filenameFilter = (File dir, String name)-> name.startsWith("Demo1");
        String[] allFileNameList = folder.list(filenameFilter);
        for (String fileName : allFileNameList) {
            System.out.println(fileName);
        }
    }
}
