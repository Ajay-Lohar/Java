package oops.anonymousClass;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            void m1() {
                System.out.println(" A class m1 method");
            }
        }

        class Child extends A {
            @Override
            void m1() {
                System.out.println("m1 in Child class");
            }
        }

        A a = new Child();

        //anonymous class
        A ref = new A() {
            @Override
            void m1() {
                System.out.println("m1 method in anonmoys class");
            }
        };
        ref.m1();
    }
}
