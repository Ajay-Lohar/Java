package classAndObject;

public class Demo2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1 = null;
        System.out.println("Student ID " + student1.id);//NullPointerException
        System.out.println("Student Name " + student1.name);
        System.out.println("Student Phone " + student1.phone);
    }
}
