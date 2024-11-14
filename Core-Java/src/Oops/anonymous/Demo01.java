package Oops.anonymous;

public class Demo01 {
    public static void main(String[] args) {
        class A {
            void m1(){

            }
        }
        A a= new A(){
            void m1(){
                System.out.println(" Anynomous Class m1 method");
            }
        };

       a.m1();
    }
}
