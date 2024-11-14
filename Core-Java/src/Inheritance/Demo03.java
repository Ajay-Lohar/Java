package Inheritance;

public class Demo03 {
    public static void main(String[] args) {
        class A {
            static {
                System.out.println(" A static block");
            }
            {
                System.out.println(" A instance Block ");
            }
            A(){
                System.out.println(" A constructor");
            }
        }
        class B extends A{
            static {
                System.out.println(" B static block");
            }
            {
                System.out.println(" B instance Block ");
            }
            B(){
                System.out.println(" B constructor");
            }
        }
        class C extends B{
            static {
                System.out.println(" C static block");
            }
            {
                System.out.println(" C instance Block ");
            }
            C(){
                System.out.println(" C constructor");
            }
        }
//        A a =new A();
//        output
//        A static block
//        A instance Block
//        A constructor

//        B b =new B();
        //Output
//        A static block
//        B static block
//        A instance Block
//        A constructor
//        B instance Block
//        B constructor

        C c = new C();
        //output
//        A static block
//        B static block
//        C static block
//        A instance Block
//        A constructor
//        B instance Block
//        B constructor
//        C instance Block
//        C constructor

    }
}
