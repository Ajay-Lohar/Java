package _6_oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        class A {
            void m1() {
                System.out.println("m1");
            }
        }
        class B extends A {
            void m2() {
                System.out.println("m2");
            }
        }
        class C extends B {
            void m3() {
                System.out.println("m3");
            }
        }

        /*A a = new A();
        a.m1();*/

       /* B b = new B();
        b.m1();
        b.m2();*/

        /*A a = new B();
        a.m1();
        a.m2();*/

        A c = new  C();
        c.m1();
       /* c.m2();
        c.m3();*/
    }
}
