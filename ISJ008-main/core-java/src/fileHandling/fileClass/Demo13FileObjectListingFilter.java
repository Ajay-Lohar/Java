package fileHandling.fileClass;

import java.io.File;

public class Demo13FileObjectListingFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ008\\core-java\\src\\exceptionHandling");
        File[] files = folder.listFiles();
        for (File file:files){
            System.out.println(file.getName()+"\t"+file.length()+"\t"+file.getAbsolutePath());
        }
    }
}
