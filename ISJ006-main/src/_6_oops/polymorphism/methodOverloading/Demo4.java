package _6_oops.polymorphism.methodOverloading;

public class Demo4 {
    public static void main(String[] args) {
        class Parent {
            void m1() {
                System.out.println("Parent m1 method");
            }
        }

        class Child extends Parent {
            void m1(int number) {
                System.out.println("Child m2 method");
            }
        }
        Child child = new Child();
        child.m1();
        child.m1(100);
    }
}
