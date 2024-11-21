package FileHandaling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo10FileListing {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Practice\\Java\\Core-Java\\src\\FileHandaling";
        File folder = new File(path);
        File[] fileObjectArray = folder.listFiles();

        for (File file : fileObjectArray){
            System.out.println(file.getName()+"\t"+file.length()+"\t"+file.getAbsolutePath());
        }
    }
}
