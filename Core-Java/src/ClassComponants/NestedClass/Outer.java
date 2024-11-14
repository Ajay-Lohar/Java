package ClassComponants.NestedClass;

public class Outer {
    int a =10;
    void m1(){
        System.out.println("outer class m1 method");
    }
    class inner{
        int b =100;
        void m1(){
            System.out.println("inner class m1 method");
        }
    }
}
