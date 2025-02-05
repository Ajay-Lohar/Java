package oops.inheritance;

public class A {
    static {
        System.out.println("A - Static block");
    }

    {
        System.out.println("A - instance block");
    }

    A() {
        //1. constructor
        //2. instance block of the same class
        System.out.println("A - constructor");
    }
}
