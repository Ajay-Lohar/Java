package oops.java8Features.lambdaExpression;

public class Demo2 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Predicate {
            boolean test(int number);
        }

        Predicate predicate = number -> number % 2 == 0;
        System.out.println("Is even number : "+predicate.test(10));
        System.out.println("Is even number : "+predicate.test(11));
    }


}
