package oops.objectClass;

import lombok.AllArgsConstructor;

public class Demo10ToString {
    public static void main(String[] args) {
        @AllArgsConstructor
        class Student {
            int id;
            String name;

            @Override
            public String toString() {
                return "Student [id=" + this.id +
                        ", name = " + this.name +
                        "]";

            }
        }
        Student student = new Student(1, "Sachin");
        System.out.println(student.toString());
        System.out.println(student);
    }
}
