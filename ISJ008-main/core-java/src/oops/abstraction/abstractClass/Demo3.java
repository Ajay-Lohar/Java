package oops.abstraction.abstractClass;

public class Demo3 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }
        class B extends A{
            @Override
            void m1() {
                System.out.println("m1 method overridden in child class B");
            }
        }

       // A a = new A();//CTE - abstract class cant be instanced
        A a = new B();
        a.m1();

    }
}
