package oops.objectClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Demo16DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        class Address implements Cloneable {
            String city;
            String country;
            int pinCode;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        @AllArgsConstructor
        @ToString
        class Student implements Cloneable {
            int id;
            String name;
            Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                Student studentClonedObject = (Student) super.clone();
                Address address = (Address) studentClonedObject.address.clone();
                studentClonedObject.address = address;
                return studentClonedObject;
            }
        }

        Address address = new Address("Pune", "IN", 12345);
        Student student1 = new Student(1, "Pratik", address);
        Student student2 = (Student) student1.clone();
        student1.address.city = "Mumbai";
        System.out.println(student1);
        System.out.println(student2);

    }
}
