package misc.instanceOfDemo;

public class Parent {
    public static void main(String[] args) {
        class Child extends Parent {
        }

        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent instanceof Child);//false
        System.out.println(parent instanceof Parent);//true

        System.out.println(child instanceof Child);//true
        System.out.println(child instanceof Parent);//true
    }
}

