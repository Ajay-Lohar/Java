package _6_oops.abstraction;

public class Demo8 {
    public static void main(String[] args) {
        class Parent {}

        class Child extends Parent{}

        Parent parent = new Child();
        Parent parentAnon = new Parent(){};
    }
}
