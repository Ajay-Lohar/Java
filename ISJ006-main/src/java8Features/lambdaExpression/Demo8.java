package java8Features.lambdaExpression;

import java.util.function.Supplier;

public class Demo8 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "string is supplied by Supplier";
        System.out.println(supplier.get());

    }
}
