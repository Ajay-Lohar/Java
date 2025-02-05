package oops.java8Features.lambdaExpression;

public class Demo4 {
    public static void main(String[] args) {
        interface Predicate<X> {
            boolean test(X x);
        }
        Predicate<String> predicate = (str) ->str.startsWith("A");
        System.out.println(predicate.test("Abc"));
        System.out.println(predicate.test("xyz"));
    }
}
