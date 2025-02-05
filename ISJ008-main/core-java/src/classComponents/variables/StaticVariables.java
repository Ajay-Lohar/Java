package classComponents.variables;

public class StaticVariables {
    public static void main(String[] args) {
        System.out.println("Static variable "+Student.collegeName);
        //args : local reference variable
        Student student1 = new Student();// student1 : local reference variable
        Student student2 = new Student();// student1 : local reference variable
        System.out.println("student 1 id="+student1.id);
        System.out.println("student 1 name="+student1.name);

        System.out.println("student 2 id="+student2.id);
        System.out.println("student 2 name="+student2.name);



    }
}
