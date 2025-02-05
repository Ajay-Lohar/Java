package _5_classComponents.constructors;

public class Student {
    int studentId;
    String studentName;
    int passingYear;

    public static void main(String[] args) {
        Student student = new Student();//default constructor
        System.out.println("Student id " + student.studentId);
        System.out.println("Student Name " + student.studentName);
        System.out.println("Student passing year  " + student.passingYear);

    }
}
