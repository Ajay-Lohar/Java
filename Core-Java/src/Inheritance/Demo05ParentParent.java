package Inheritance;

public class Demo05ParentParent {
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
        Parent p = new Parent();
        System.out.println(p.v1);
        p.m1();

        //parent class is cannot access child class members
//        System.out.println(p.v2);//CTE
//        p.m2();//CTE
    }
}
