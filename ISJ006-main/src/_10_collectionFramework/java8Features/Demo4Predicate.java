package _10_collectionFramework.java8Features;

public class Demo4Predicate {

    @FunctionalInterface
    interface Predicate {
        boolean test(int number);
    }

    public static void main(String[] args) {
        Predicate predicate = (number) -> number % 2 == 0;
        System.out.println(predicate.test(99));//false
        System.out.println(predicate.test(100));//true
    }
}
