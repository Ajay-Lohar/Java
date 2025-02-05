package oops.inheritance;

public class B extends A {
    static {
        System.out.println("B - Static block");
    }

    {
        System.out.println("B - instance block");
    }

    B() {
       //1. constructor call
        //2. instance block
        super();
        System.out.println("B - constructor");
    }
}
