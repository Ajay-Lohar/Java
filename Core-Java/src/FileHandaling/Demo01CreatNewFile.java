package FileHandaling;

import java.io.File;
import java.io.IOException;

public class Demo01CreatNewFile {
    public static void main(String[] args) throws IOException {
            //Absolute path : complete path --> C:\Work\ISJ010\core-java\src\fileHandling\Demo1.java
            //Relative path -
            String path = "abc1.txt";
            File file = new File(path);
            boolean isFileCreated = file.createNewFile();
            System.out.println("File created " + isFileCreated);

            //    if file is already present will be not created new file
        }
}

