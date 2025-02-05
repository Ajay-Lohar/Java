package classComponents.methods;

public class A {
    public static void main(String[] args) {
        //static methods within the same class : directly or using class name
       /* m2();
        A.m2();*/

        //instance method
        A a = new A();
        a.m1();
    }

    public void m1() {
        System.out.println("m1 instance method");
        //calling print method from m1
        print();
        this.print();
    }

    static public void m2() {
        System.out.println("m2 static method");
    }

    public void print(){
        System.out.println("print instance method");
    }
}
