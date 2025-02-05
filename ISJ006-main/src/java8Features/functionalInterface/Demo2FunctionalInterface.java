package java8Features.functionalInterface;

public class Demo2FunctionalInterface {
    @FunctionalInterface
    interface I {
        void m1();
        //void m2();
    }

    public static void main(String[] args) {
        class Child implements I {
            @Override
            public void m1() {
                System.out.println("m1 override");
            }
        }

        I i = new Child();
        i.m1();
    }
}
