package java8features;

public class Demo07PredicateCustom {
    public static void main(String[] args) {
    @FunctionalInterface
        interface Predicate{
        boolean test (int number);
    }
    Predicate isEven = (number) -> number%2==0;

        System.out.println("is even test "+ isEven.test(10));
        System.out.println("is even test "+ isEven.test(11));
    }

    }

