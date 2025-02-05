package oops.polymorphism.methodOverloading;

public class Demo2 {
    Demo2(){}
    Demo2(int a){}
    public static void main(String[] args) {
        System.out.println("main method with args");
        main();
    }

    //overloaded
    public static void main() {
        System.out.println("main method without args");
    }
}
