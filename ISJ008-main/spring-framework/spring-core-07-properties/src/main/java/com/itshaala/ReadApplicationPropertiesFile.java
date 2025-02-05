package com.itshaala;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadApplicationPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Work\\ISJ008\\spring-framework\\spring-core-07-properties\\src\\main\\resources\\application.properties"));
        System.out.println(properties);
    }
}
