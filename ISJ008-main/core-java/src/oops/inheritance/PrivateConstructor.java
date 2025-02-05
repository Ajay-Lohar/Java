package oops.inheritance;

public class PrivateConstructor {
    public static void main(String[] args) {
        class A {
            A(){}
        }
        class B extends A{

        }
        B b = new B();
    }
}
