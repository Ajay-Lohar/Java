package fileHandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1FileOutputStreamWriteBytesToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //will append the content at the end of file
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write('A');
        fileOutputStream.close();
        System.out.println("file content written");
    }
}
