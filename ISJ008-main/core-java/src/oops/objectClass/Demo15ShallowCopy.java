package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Demo15ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        class Address {
            String city;
            String country;
            int pinCode;
        }

        @AllArgsConstructor
        @ToString
        class Student implements Cloneable{
            int id;
            String name;
            Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address = new Address("Pune", "IN", 12345);
        Student student1 = new Student(1, "Pratik", address);
        Student student2 = (Student) student1.clone();
        System.out.println(student1 + "\t" + student1.hashCode());
        System.out.println(student2 + "\t" + student2.hashCode());
        System.out.println("Address object of student 1 " + student1.address.hashCode());
        System.out.println("Address object of student 2 " + student2.address.hashCode());
        student1.address.city = "Mumbai";
        System.out.println(student1);
        System.out.println(student2);

    }
}
