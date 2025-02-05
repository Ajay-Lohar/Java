package _6_oops.inheritance.constructorChaining;

public class Child extends Parent {
    static {
        System.out.println("child class static block");
    }

    {
        System.out.println("child class instance block");
    }

    Child() {
        //1. constructor call
        super();
        //2. instance block
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
