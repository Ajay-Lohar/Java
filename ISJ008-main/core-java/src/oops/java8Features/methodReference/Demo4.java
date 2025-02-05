package oops.java8Features.methodReference;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = (number) -> {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(19));
        System.out.println(isPrime.test(20));


        Predicate<Integer> isPrime2 = Demo4::isPrime;
        System.out.println(isPrime2.test(19));
        System.out.println(isPrime2.test(20));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
