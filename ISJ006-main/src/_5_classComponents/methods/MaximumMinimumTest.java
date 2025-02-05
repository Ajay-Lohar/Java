package _5_classComponents.methods;

import java.util.Scanner;

public class MaximumMinimumTest {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Minimum is " +
                MaximumMinimumTest.getMinimumNumber(number1, number2, number3));

        System.out.println("Maximum is " +
                MaximumMinimumTest.getMaximumNumber(number1, number2, number3));
    }

    public static int getMinimumNumber(int number1, int number2, int number3) {
        return (number1 < number2 && number1 < number3)
                ? number1
                : (number2 < number1 && number2 < number3
                ? number2
                : number3);

    }

    public static int getMaximumNumber(int number1, int number2, int number3) {
        return (number1 > number2 && number1 > number3)
                ? number1
                : (number2 > number1 && number2 > number3
                ? number2
                : number3);

    }
}
