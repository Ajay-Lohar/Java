package Oops.Polymorphism;

public class Demo01 {
    public static void main(String[] args) {
        class  Addition{
            public int add(int a,int b){
                return a+b;
            }
            public double add(float a,float b){
                return a+b;
            }
            public int add(int a,int b,int c) {
                return a + b + c;
            }
        }
        class Child extends Addition{
            // method overloading
            public int add(int a,int b,int c,int d){
                return a+b+c+d;
            }
        }
        Child addition = new Child();
        System.out.println(addition.add(1,3));
        System.out.println(addition.add(6,40.6f));
        System.out.println(addition.add(1,3,8));

        System.out.println(addition.add(10,30,40,80));
    }
}
