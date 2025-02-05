package objectClassMethods;

import java.util.Objects;

public class Demo7 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return id == student.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
        }
        Student student1 = new Student(1, "Vinit");
        Student student2 = new Student(1, "Vinit");
        System.out.println(student1.equals(student2));
    }
}
