package _6_oops.polymorphism.methodOverloading;

public class Demo2 {
    Demo2() {
        System.out.println("zero param con");
    }

    Demo2(int i) {
        System.out.println("parameterized cons");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        Demo2 demo3 = new Demo2(10);
    }
}
