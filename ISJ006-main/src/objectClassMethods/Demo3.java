package objectClassMethods;

public class Demo3 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        int a = 10;
        int b = 10;
        System.out.println(a == b);//true

        Student student1 = new Student(1, "Onkar");
        Student student2 = new Student(1, "Onkar");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false

        System.out.println(student1 == student1);//true
        System.out.println(student1.equals(student1));//true

        System.out.println(student2 == student2);//true
        System.out.println(student2.equals(student2));//true
    }
}
