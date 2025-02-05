package _6_oops.abstraction;

public class Demo3 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();

            abstract void m2();

            abstract void m3();
        }
        abstract class B extends A {
            @Override
            void m1() {
                System.out.println("m1");
            }

            @Override
            void m2() {
                System.out.println("m2");
            }
            abstract void m4();
        }
        class C extends B {


            @Override
            void m3() {
                System.out.println("m3");
            }

            @Override
            void m4() {
                System.out.println("m4");
            }
        }

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
    }
}
