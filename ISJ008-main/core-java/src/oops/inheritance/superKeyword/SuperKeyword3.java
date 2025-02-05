package oops.inheritance.superKeyword;

public class SuperKeyword3 {
    public static void main(String[] args) {
        class A {
            int a = 100;
        }
        class B extends A {
            int a = 11111;
            void display(int a) {
                System.out.println("Local variable " + a);
                System.out.println("super variable " + super.a);//100
                System.out.println("super variable " + this.a);//11111
            }
        }

        B b = new B();
        b.display(1000);
    }
}
