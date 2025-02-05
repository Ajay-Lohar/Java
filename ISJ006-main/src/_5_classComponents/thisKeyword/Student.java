package _5_classComponents.thisKeyword;

public class Student {
    int studentId;
    String studentName;

    //setter methods

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1001);
        student.setStudentName("Sachin");
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student Name: " + student.studentName);


    }
}
