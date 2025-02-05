package java8Features.defaultMethods;

public class Demo1 {
    interface I {
        void m1();

       default void m2(){
           System.out.println("Default m2 implementation");
       }
    }

    public static void main(String[] args) {
        I i1 = new I() {
            @Override
            public void m1() {
                System.out.println("i1 m1 method");
            }
        };
        I i2 = new I() {
            @Override
            public void m1() {
                System.out.println("i2 m1 method");
            }
        };
        I i3 = new I() {
            @Override
            public void m1() {
                System.out.println("i3 m1 method");
            }
        };
        I i4 = new I() {
            @Override
            public void m1() {
                System.out.println("i4 m1 method");
            }
        };

        i1.m1();
        i2.m1();
        i3.m1();
        i4.m1();

        i1.m2();
        i2.m2();
        i3.m2();
        i4.m2();
    }
}
