package Inheritance;

public class Demo06ChildChild {

    public static void main(String[] args) {
        class Parent{
            int v1=100;
            void m1(){
                System.out.println("parent method ");
            }
        }
        class Child extends Parent{
            int v2=200;
            void m2(){
                System.out.println("Child Method");
            }

        }
       Child c = new Child();
        System.out.println(c.v1);
        c.m1();


    }
}
