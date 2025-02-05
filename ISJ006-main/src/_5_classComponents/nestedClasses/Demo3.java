package _5_classComponents.nestedClasses;

public class Demo3 {
    int a = 100;
    class A {
        int a = 10;
        // static int b = 20;

        void m1() {
            System.out.println("instance method");
        }

      /*  static void m2() {
            System.out.println("static method");
        }*/

        A() {
            System.out.println("constructor of the inner classes");
        }

        {
            System.out.println("instance block");
        }

       /* static {
            System.out.println("static block");
        }*/

    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3.a);

        A a = demo3.new A();
        System.out.println("inner class instance variable "+a.a);
        a.m1();

    }
}
