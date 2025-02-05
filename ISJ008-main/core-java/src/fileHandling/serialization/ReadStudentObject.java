package fileHandling.serialization;

import java.io.*;

public class ReadStudentObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
    }
}
