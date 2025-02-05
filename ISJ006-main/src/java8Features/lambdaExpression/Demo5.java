package java8Features.lambdaExpression;

import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(100));//true
        System.out.println(isEven.test(101));//false
    }
}
