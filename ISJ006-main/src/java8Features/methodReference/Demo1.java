package java8Features.methodReference;

import java.awt.*;

public class Demo1 {
    interface A {
        void accept(String str);
    }

    public static void main(String[] args) {
        //lambda expression
        A a = (str) -> System.out.println(str);
        a.accept("Good evening");

        //method reference
        A a1 = System.out::println;
        a1.accept("good morning");
    }
}
