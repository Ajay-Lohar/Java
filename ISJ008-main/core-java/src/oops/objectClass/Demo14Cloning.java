package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Demo14Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        class Student implements Cloneable{
            int id;
            String name;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        Student student1 = new Student(1, "Pratik");
        Student student2 = student1;// this is reference copy
        Student student3 = (Student) student1.clone();

        System.out.println(student1 + "\t" + student1.hashCode());
        System.out.println(student2 + "\t" + student2.hashCode());
        System.out.println(student3 + "\t" + student3.hashCode());
    }
}
