package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo8FileNameListing {
    public static void main(String[] args) throws IOException {
        //print the all files name in given folder
        String path = "D:\\Practice\\Java\\Core-Java\\src\\FileHandaling";

        File folder = new File(path);
        String[] namesOfGivenFolder = folder.list();

        for (String fileNames :namesOfGivenFolder){
            System.out.println(fileNames);
        }


    }
}
