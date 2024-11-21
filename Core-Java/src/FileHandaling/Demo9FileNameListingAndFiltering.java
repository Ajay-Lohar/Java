package FileHandaling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo9FileNameListingAndFiltering {
    public static void main(String[] args) throws IOException {
        //print the all files name in given folder
        String path = "D:\\Practice\\Java\\Core-Java\\src\\FileHandaling";

        File folder = new File(path);

//        FilenameFilter filefilter = (dir,name)-> name.length()>22;// filer the file length is above 22
//        FilenameFilter filefilter2 = (dir,name)-> name.startsWith("D"); // file name start with D name
          FilenameFilter filefilter3 = (dir,name)-> name.contains("Demo01");// file name start with D name

        String[] namesOfGivenFolder = folder.list(filefilter3);

        for (String fileNames : namesOfGivenFolder){
            System.out.println(fileNames);
        }
    }
}
