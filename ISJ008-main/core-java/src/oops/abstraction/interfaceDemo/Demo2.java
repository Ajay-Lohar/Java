package oops.abstraction.interfaceDemo;

public class Demo2 {
    public static void main(String[] args) {
        interface I1 {
            void method();
        }
        interface I2 {
            void method();
        }

        class Child implements I1, I2 {
            @Override
            public void method() {
                System.out.println("child class method");
            }
        }

        I2 ref = new Child();
        ref.method();
    }
}
