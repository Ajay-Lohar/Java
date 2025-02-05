package classAndObject;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        //Student : ClassName  or custom data structure or type or custom data type
        //student1 : reference variable which refers to an object
        // = : assignment operator
        // new : keyword to create an object
        // Student() : constructor call which is creating the object
        // new Student() : this is an object
        System.out.println("Student object reference " + student1);
        System.out.println("student object created");
        System.out.println("Student ID " + student1.id);
        System.out.println("Student Name " + student1.name);
        System.out.println("Student Phone " + student1.phone);
    }
}
