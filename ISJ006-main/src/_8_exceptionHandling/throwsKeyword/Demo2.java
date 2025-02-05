package _8_exceptionHandling.throwsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("1788.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File is not there");
        }
        System.out.println("rest of the main method");
    }
}
