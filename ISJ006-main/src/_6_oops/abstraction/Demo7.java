package _6_oops.abstraction;

public class Demo7 {

    public static class A {
        void m1() {
        }
    }//concrete parent class

    static abstract class B {
        abstract void m1();
    } //abstract parent class

    interface C {
        public void m1();
    } //interface parent

    public static void main(String[] args) {
        class ChildA extends A {
        }
        A a = new ChildA();

        //anonymous class concept

        A anonymous = new A() {
        };
        anonymous.m1();

        class ChildB extends B {
            void m1() {
            }
        }
        B b = new ChildB();


        B bAnonymous = new B() {
            void m1() {
            }
        };

        class ChildC implements C {
            public void m1() {
            }
        }
        C c = new ChildC();

        C Anonymoousc = new C() {
            public void m1() {
            }
        };

    }
}
