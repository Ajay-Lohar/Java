package fileHandling.fileClass;

import java.io.File;

public class Demo10FileListing {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ008\\core-java\\src\\exceptionHandling");

        //gives all file names from the folder
        String[] allFileNameList = folder.list();
        for (String fileName : allFileNameList) {
            System.out.println(fileName);
        }
    }
}
