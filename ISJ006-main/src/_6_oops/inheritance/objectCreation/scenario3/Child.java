package _6_oops.inheritance.objectCreation.scenario3;

public class Child extends Parent {

    int a = 100;
    int b = 200;

    void m1() {
        System.out.println("Child class : m1");
    }

    public static void main(String[] args) {
        Parent child = new Child();
        System.out.println(child.a);
        System.out.println(child.b);
        child.m1();
    }

}
