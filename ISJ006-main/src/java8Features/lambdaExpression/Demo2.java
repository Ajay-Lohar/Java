package java8Features.lambdaExpression;

public class Demo2 {

    @FunctionalInterface
    interface A {
        void m1();
    }

    public static void main(String[] args) {
        // way 1 : traditional way
        class Child implements A {
            @Override
            public void m1() {
                System.out.println("m1 method from traditional way");
            }
        }
        A a1 = new Child();
        a1.m1();

        //way 2 : anonymous class
        A a2 = new A() {
            @Override
            public void m1() {
                System.out.println("m1 method from anonymous way");
            }
        };
        a2.m1();

        //way 3 : Lambda Expression
        A a3 = () -> System.out.println("m1 method from lambda way");
        a3.m1();
    }
}
