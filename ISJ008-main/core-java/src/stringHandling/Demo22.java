package stringHandling;

public class Demo22 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        String str = "abc";
        System.out.println(str.toString());
        System.out.println(str);

        Student student = new Student();
        System.out.println(student);
    }
}
