package oops.abstraction.interfaceDemo;

public class Demo1 {
    public static void main(String[] args) {
        interface I1 {
            // by default variables are public static final
            int variable = 100;

            //by default methods will be  public abstract
            //from java 8 : static methods and default methods are allowed
            void m1();

            // constructors are not allowed
            //I1(){}

            //blocks are not allowed
            //{}
            //static {}

            // by default nested classes are public static
            public static class NestedClass{}
        }

        //I1 ref = new I1();// CTE - interface cannot be instantiated

        // how to create subclass of an interface

        class Subclass implements I1{
            @Override
            public void m1() {
                System.out.println("m1 overridden in subclass");
            }

            public void m2() {
                System.out.println("m2 in subclass");
            }
        }

        I1 ref = new Subclass();
        ref.m1();
       // ref.m2(); //CTE
    }
}
