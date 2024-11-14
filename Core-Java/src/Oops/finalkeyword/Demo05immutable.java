package Oops.finalkeyword;

public class Demo05immutable {
    public static void main(String[] args) {
        class Student {
            int id ;
            String name;
        }
        Student student = new Student();
        student.id = 1;
        student.name = "Rahul";
    }

}
