package _6_oops.inheritance;

public class B extends A {
    B() {
        //1. call to the same class constructor or super class constructor
        // there is an always a call to the super class constructor
        //super();
        //2. instance block
        System.out.println("B class con");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
