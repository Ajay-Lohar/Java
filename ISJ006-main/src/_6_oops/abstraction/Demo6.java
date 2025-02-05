package _6_oops.abstraction;

public class Demo6 {
    interface I {
        void m1();

      /*  void m2(){
            System.out.println("m2 method");
        }*/
    }

    abstract class A {
        public abstract void m1();

        void m2(){
            System.out.println("m2 method");
        }
    }
}
