package _6_oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {
        abstract class A {
            int a = 1;
        }

        abstract class B extends A {
            int a = 10;
        }
        class C extends B {
            int a = 100;
        }
        A a = new C();
        System.out.println(a.a);//1

        B b = new C();
        System.out.println(b.a);//10

        C c = new C();
        System.out.println(c.a);//100

    }
}
