package java8Features.staticMethods;

public class Demo1 {
    interface A {
        //static methods
        public static void staticMethod(){
            System.out.println("static method in interface A");
        }

        //default methods
        default void defaultMethod(){
            System.out.println("default method in interface A");
        }

        //abstract method
        void abstractMethod();

    }

    public static void main(String[] args) {
        class Child implements A{
            @Override
            public void abstractMethod() {
                System.out.println("abstract method overridden in class Child");
            }
        }
        A a = new Child();
        a.defaultMethod();
        a.abstractMethod();
        A.staticMethod();
    }
}
