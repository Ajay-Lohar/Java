package _5_classComponents.methods;

public class NumberChecker {
    public static void main(String[] args) {
        System.out.println("Is Even " + isEven(100));//true
        System.out.println("Is Odd " + isOdd(99));//true
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
