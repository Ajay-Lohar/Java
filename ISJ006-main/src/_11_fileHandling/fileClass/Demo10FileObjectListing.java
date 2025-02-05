package _11_fileHandling.fileClass;

import java.io.File;

public class Demo10FileObjectListing {
    public static void main(String[] args) {
        File folder  = new File("C:\\Work\\ISJ006\\src\\_7_array");
        File[] files = folder.listFiles();
        for (File file:files) {
            System.out.println(file.getName()+"\t"+file.length()+"\t"+file.getAbsolutePath());
        }
    }
}
