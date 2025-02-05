package _6_oops.polymorphism.methodOverloading;

public class Demo7 {
    public static void main(String[] args) {
        class Parent {
            final void m1() {
                System.out.println("Parent m1");
            }

            public void m2() {
                System.out.println("Parent m2");
            }
        }
        class Child extends Parent {
           // @Override
            /*public void m1() {
                System.out.println("Child m1");
            }*/

            @Override
            public void m2() {
                System.out.println("Child m2");
            }
        }
        Child child = new Child();
        child.m1();
        child.m2();
    }
}
