package _6_oops.abstraction;

public class Demo2 {

    public static void main(String[] args) {
        abstract class A {
           // abstract void m1();
            A() {
                System.out.println("A class constructor");
            }
        }

        class B extends A {
            B() {
                super();
            }
        }

        //A a = new A();
        B b = new B();
    }
}
