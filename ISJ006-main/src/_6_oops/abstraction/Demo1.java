package _6_oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        abstract class Parent {
            abstract void m1();

            Parent() {
                System.out.println("Parent con");
            }
        }
        class Child extends Parent {
            Child() {
                System.out.println("Child con");
            }

            @Override
            void m1() {
                System.out.println("Child m1");
            }
        }
        Parent parent = new Child();
        parent.m1();

    }
}
