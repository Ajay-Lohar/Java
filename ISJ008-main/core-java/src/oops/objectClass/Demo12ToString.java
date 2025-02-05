package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Demo12ToString {
    public static void main(String[] args) {
        @AllArgsConstructor
        @ToString
        class Student {
            int id;
            String name;

        }
        Student student = new Student(1, "Pratik");
        System.out.println(student.toString());
        System.out.println(student);
    }
}
