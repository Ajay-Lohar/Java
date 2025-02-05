package _6_oops.polymorphism.methodOverloading;

public class Demo5 {
    public static void main(String[] args) {
        class Parent {
            void m1() {
                System.out.println("Parent m1 method");
            }

            void m2() {
                System.out.println("Parent m2 method");
            }

            void m3() {
                System.out.println("Parent m3 method");
            }
        }

        class Child extends Parent {
            @Override
           public void m3() {
                System.out.println("child m3 method");
            }
        }
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();
    }
}
