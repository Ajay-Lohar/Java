package java8Features.methodReference;

import java.util.function.Consumer;

public class Demo3 {


    public static void main(String[] args) {

        Consumer consumer = (input) -> System.out.println(input);
        consumer.accept("lambda expression");

        Consumer consumer1 = System.out::println;
        consumer1.accept("method reference ");

    }

}
