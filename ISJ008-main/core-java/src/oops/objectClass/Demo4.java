package oops.objectClass;

import lombok.AllArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {

        @AllArgsConstructor
        class Student {
            int id;
            String name;

            @Override
            public boolean equals(Object obj) {
                if (obj == null || (!(obj instanceof Student))) {
                    return false;
                }
                Student student = (Student) obj;
                if (this == student) {
                    return true;
                }
                return this.id == student.id;
            }
        }
        class Product {
        }
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");

        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//true
        // System.out.println(student1.equals(null));//NPE
        System.out.println(student1.equals(null));//false
        System.out.println(student1.equals(student1));//true
        Product product = new Product();
        System.out.println(student1.equals(product));
    }
}
