package oops.java8Features;

public class Demo2 {
    public static void main(String[] args) {
        interface I1{
            default void method(){
                System.out.println("I1 method");
            }
        }

        interface I2{
            default void method(){
                System.out.println("I2 method");
            }
        }

        class Child implements I1, I2{
            @Override
            public void method() {
                I1.super.method();
                I2.super.method();
                System.out.println("rest of the code of Child class method");
            }
        }

        Child child = new Child();
        child.method();
    }
}
