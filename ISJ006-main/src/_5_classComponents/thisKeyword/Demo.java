package _5_classComponents.thisKeyword;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1();
        //this.m1();//this is not available in the static context
    }

    void m1() {
       // m2();
        this.m2();
    }

    void m2() {
        System.out.println("m2 method");
    }
}
