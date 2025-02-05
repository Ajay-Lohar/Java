package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo8FileDetails {
    public static void main(String[] args) throws IOException {
        File file1 = new File("abc.txt");
        File folder = new File("C:\\Users\\sande\\OneDrive\\Desktop\\file-handling");
        System.out.println("is it file " + file1.isFile());//true
        System.out.println("is it file " + folder.isFile());//false

        System.out.println("File length : "+file1.length());//number of characters
        System.out.println("Last modified "+file1.lastModified());
        System.out.println("Relative Path "+file1.getPath());
        System.out.println("Absolute Path "+file1.getAbsolutePath());
        System.out.println("File Permission "+file1.canWrite());
    }
}
