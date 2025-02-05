package _6_oops.inheritance.constructorChaining;

public class Parent {
    static {
        System.out.println("parent class static block");
    }

    {
        System.out.println("parent class instance block");
    }

    Parent() {
        //1. constructor call
        super();
        //2. instance block
        System.out.println("parent class constructor");
    }
}
