package java8Features.lambdaExpression;

import java.util.function.BiPredicate;

public class Demo10 {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equalsIgnoreCase(str2);
        System.out.println(biPredicate.test("abc", "abc"));
    }
}
