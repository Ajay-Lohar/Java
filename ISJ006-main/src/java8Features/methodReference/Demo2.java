package java8Features.methodReference;

public class Demo2 {


    interface A {
        void accept(String str);
    }

    public static void main(String[] args) {
        A a = (String str) -> System.out.println(str);
        a.accept("lambda");

        A a2 = Demo2::print1;
        a2.accept("static method reference");

        Demo2 demo2 = new Demo2();
        A a3 = demo2::print2;
        a3.accept("instance method reference");

        A a4 = Demo2::new;
        a4.accept("constructor method reference");
    }

    public static void print1(String str) {
        System.out.println(str);
    }

    public void print2(String str) {
        System.out.println(str);
    }

    public Demo2(String str) {
        System.out.println(str);
    }

    public Demo2() {
    }
}
