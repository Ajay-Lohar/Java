package ClassComponants.Methods;

public class A {
    int a =10;
    void m1(){
        System.out.println("M1 Method is Excute :");

    }

    void m2(){
        System.out.println("M2 Method is Excute :");
        this.m1();// thise keywordd use the current/same class method

    }
   static void m3(){
       System.out.println("M2 Method is Excute :");

    }
}
