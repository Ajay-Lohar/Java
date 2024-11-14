package ClassComponants.Variable;

class Student {

    //Thise are instance variables

    int studentId ;//<-- It  is a Primetive IV
    String studentName ;//<-- It  is a Non-Primetive IV
    static String collegeName ="KIt IMER ,Kolhapure"; //<---Static variable

}

// main method is called automatically 
public class Demo1 {
    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2=new Student();
        System.out.println(s1);//<-- hashcode /reference /address

        //set the values
        s1.studentId=101;
        s1.studentName="Pratiksha Mali";

        //Print the values
        System.out.println("Student Id \t"+s1.studentId);
        System.out.println("Student Name \t"+ s1.studentName);

        s2.studentId=102;
        s2.studentName="Ajay Lohar";

        //Print the values
        System.out.println("Student Id \t"+s2.studentId);
        System.out.println("Student Name \t"+ s2.studentName);


        //Access the Static variable
        System.out.println("Student College \t"+Student.collegeName);  //  its call by Direct class name or group name

    }

}
