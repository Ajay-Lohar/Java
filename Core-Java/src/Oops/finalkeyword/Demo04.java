package Oops.finalkeyword;

public class Demo04 {
    public static void main(String[] args) {
        class A {
           final void foo(){
                System.out.println(" A foo");
            }
        }
        class B extends A{
            //CTE--> final method can be overridden
//            void foo(){
//                System.out.println(" B foo");
//            }
        }
    }
}
