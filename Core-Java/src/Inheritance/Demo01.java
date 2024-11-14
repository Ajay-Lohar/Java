package Inheritance;

public class Demo01 {
    public static void main(String[] args) {
        class A {
            int a1=100 ;
            void methodA(){
                System.out.println("instance method Of  A");
            }
            A(){
                System.out.println("A Constructor");
            }
        }
        // single level Inheritance
        class B extends A{
            int b1 =200;
            void methodB(){
                System.out.println("instance method Of  B");
            }
        }

        A a =new A();
        System.out.println(a.a1);
        a.methodA();
    }
}
