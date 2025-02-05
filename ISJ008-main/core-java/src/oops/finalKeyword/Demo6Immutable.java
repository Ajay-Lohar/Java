package oops.finalKeyword;

public class Demo6Immutable {
    public static void main(String[] args) {
        class Student{
           final int id;
            final String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Student student = new Student(1, "xyz");
        /*student.id = 101;
        student.name = "abc";*/
    }
}
