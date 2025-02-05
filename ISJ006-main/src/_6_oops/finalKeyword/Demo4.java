package _6_oops.finalKeyword;

public class Demo4 {
    public static void main(String[] args) {
        final class Student {
            final private int id;
            final private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            /*public void setId(int id) {
                this.id = id;
            }*/

            public String getName() {
                return name;
            }

           /* public void setName(String name) {
                this.name = name;
            }*/
        }

        final Student student = new Student(1, "abc");

        // student = new Student(1000,"mnp");//CTE

       // student.id = 100;
        //student.name = "pqr";

        System.out.println(student.id);
        System.out.println(student.name);


    }
}
