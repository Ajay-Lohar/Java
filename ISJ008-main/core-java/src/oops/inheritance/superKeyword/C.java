package oops.inheritance.superKeyword;

public class C extends B {
    void m3(){
        System.out.println("C: m3");
    }
    C() {
        super();
        System.out.println("C class constructor");
    }
}
