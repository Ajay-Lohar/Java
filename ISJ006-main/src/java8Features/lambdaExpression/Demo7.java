package java8Features.lambdaExpression;

import java.util.function.Consumer;

public class Demo7 {
    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("good morning");

    }
}
