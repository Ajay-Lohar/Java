package java8Features.defaultMethods;

public class Demo2 {
    interface I1 {

        default void m1() {
            System.out.println("I1: Default m1 implementation");
        }
    }

    interface I2 {

        default void m1() {
            System.out.println("I2: Default m1 implementation");
        }
    }

    public static void main(String[] args) {
        class A implements I1, I2 {
            @Override
            public void m1() {
                I1.super.m1();
                I2.super.m1();
            }
        }
        A a = new A();
        a.m1();
    }
}
