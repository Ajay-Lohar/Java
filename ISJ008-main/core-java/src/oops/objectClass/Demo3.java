package oops.objectClass;

import lombok.AllArgsConstructor;

public class Demo3 {
    public static void main(String[] args) {

        @AllArgsConstructor
        class Student {
            int id;
            String name;
        }
        int a = 100;
        int b = 100;
        System.out.println(a == b);//true
        System.out.println(a == 200);//false

        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");

        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false
    }
}
