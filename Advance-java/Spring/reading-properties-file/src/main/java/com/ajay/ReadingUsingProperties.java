package com.ajay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingUsingProperties {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Practice\\Java\\Advance-java\\Spring\\reading-properties-file\\src\\main\\resources\\application.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("driver-class"));

    }
}
