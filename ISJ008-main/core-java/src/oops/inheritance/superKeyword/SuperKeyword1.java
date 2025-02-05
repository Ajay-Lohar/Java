package oops.inheritance.superKeyword;

public class SuperKeyword1 {
    public static void main(String[] args) {
        class A {
            int a = 10;
            void m1(){
                System.out.println("A m1");
            }
        }
        class B extends A {
            int a = 20;
            int b = 99;
            void m2(){
                System.out.println("B m2");
            }
        }
        B b = new B();
        System.out.println(b.a);//20
        b.m1();//
        b.m2();

        A ref = new B();
        System.out.println(ref.a);//10
        //System.out.println(ref.b);//CTE
        ref.m1();
       // ref.m2();//CTE
    }
}
