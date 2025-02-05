package _8_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers for division operation");
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
            scanner.close();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("invalid input type. Integer expected");
        }
        System.out.println("Rest of the code");
    }
}
