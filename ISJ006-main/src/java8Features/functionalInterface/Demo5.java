package java8Features.functionalInterface;

public class Demo5 {
    public static void main(String[] args) {
        class A {
            void add() {

            }
        }
        class Student extends A {
            void add() {
                System.out.println("student added");
            }
        }
        A a = new Student();
        a.add();


        A a2 = new A() {
            void add() {
                System.out.println("student added using anonymous class");
            }
        };
        a2.add();

    }
}
