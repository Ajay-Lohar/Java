package oops.objectClass;

public class Demo1 {
    public static void main(String[] args) {

        class A{}
        class B extends A{}

        Object demo1 = new Demo1();
        System.out.println(demo1.hashCode());
        System.out.println(demo1.toString());
    }
}
