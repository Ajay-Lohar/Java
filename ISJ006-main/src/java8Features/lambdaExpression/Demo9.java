package java8Features.lambdaExpression;

import java.util.function.Function;

public class Demo9 {
    public static void main(String[] args) {
        Function<String, Integer> function = (string) -> string.length();
        System.out.println(function.apply("Java 8 Features Session"));

    }
}
