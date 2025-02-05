package fileHandling.write;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3BufferedOutputStreamWriteBytesToBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //will append the content at the end of file
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write('A');
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("file content written");
    }
}
