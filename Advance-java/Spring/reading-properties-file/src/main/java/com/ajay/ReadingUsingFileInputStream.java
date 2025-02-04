package com.ajay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadingUsingFileInputStream{
    public static void main( String[] args ) throws IOException {
        File file = new File("D:\\Practice\\Java\\Advance-java\\Spring\\reading-properties-file\\src\\main\\resources\\application.properties");
        FileInputStream fis = new FileInputStream(file);
        int read = fis.read();
        while(read != -1){
            System.out.print((char)read);
            read = fis.read();
        }
        fis.close();
    }
}
