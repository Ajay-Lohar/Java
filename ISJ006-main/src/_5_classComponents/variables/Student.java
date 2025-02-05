package _5_classComponents.variables;

public class Student {
    static String collegeName = "PU";//static variable

    int id;//instance variable
    String name;//instance variable
    int passingYear;//instance variable

    public static void main(String[] temp) {
        //temp : local variable
        int count = 0;//local variable
        Student student = new Student();
        System.out.println("accessing the local variable: directly");

        System.out.println("Local variable = " + count);



        System.out.println("Static variable = " + Student.collegeName);
        System.out.println("Accessing the instance variable using reference variable");
        student.id = 101;
        student.name = "Rahul";
        student.passingYear = 2023;
        System.out.println(student.id + "\t" + student.name + "\t" + student.passingYear);
    }

}
