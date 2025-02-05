package _5_classComponents.nestedClasses;

public class Demo2 {
    static int a = 100;
    static class A {
        int a = 10;
        static int b = 20;

        void m1() {
            System.out.println("instance method");
        }

        static void m2() {
            System.out.println("static method");
        }

        A() {
            System.out.println("constructor of the static nested classes");
        }

        {
            System.out.println("instance block");
        }

        static {
            System.out.println("static block");
        }

    }

    public static void main(String[] args) {
        System.out.println(Demo2.a);

        //accessing static nested class static members : OuterClassName.StaticNestedClassName.staticMember
        System.out.println("A class static variable "+Demo2.A.b);
        Demo2.A.m2();

        //accessing static nested class instance members : referenceOfStaticNestedClass.instanceMember

        Demo2.A aRef = new Demo2.A();
        System.out.println("A class instance variable "+aRef.a);
        aRef.m1();


    }
}
