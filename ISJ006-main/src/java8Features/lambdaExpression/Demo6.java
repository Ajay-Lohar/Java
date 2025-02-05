package java8Features.lambdaExpression;

import java.util.function.Predicate;

public class Demo6 {
    public static void main(String[] args) {
        Predicate<String> strCheck = (input)->input.startsWith("S");
        System.out.println(strCheck.test("Sandeep"));

    }
}
