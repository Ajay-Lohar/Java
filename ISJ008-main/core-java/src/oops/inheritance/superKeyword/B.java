package oops.inheritance.superKeyword;

public class B extends A{
    void m2(){
        System.out.println("B: m2");
    }
    B(){
        super();
        System.out.println("B class constructor");
    }
}
