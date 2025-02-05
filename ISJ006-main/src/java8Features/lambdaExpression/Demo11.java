package java8Features.lambdaExpression;

import java.util.function.BiConsumer;

public class Demo11 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (str, number) -> {
            System.out.println(str + "\t" + number);
        };
        biConsumer.accept("abc", 12);
    }
}
