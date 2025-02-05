package _8_exceptionHandling;

import java.util.Scanner;

public class Demo18ThrowKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        try {
            System.out.println(division(number1, number2));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator" + arithmeticException.getMessage());
        }
    }

    private static int division(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("invalid denominator");
        }
        return number1 / number2;
    }
}
