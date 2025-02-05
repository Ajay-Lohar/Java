package _6_oops.inheritance;

public class Child extends Parent {
    int d = 100;

    Child() {
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.a);
        System.out.println(child.b);
        System.out.println(child.c);
        System.out.println(child.d);
        child.m1();
    }
}
