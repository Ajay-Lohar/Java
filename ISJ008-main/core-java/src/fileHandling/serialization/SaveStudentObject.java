package fileHandling.serialization;

import java.io.*;

public class SaveStudentObject {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1,"Sachin","abc@123");
        File file = new File("student.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object saved in the file");
    }
}
