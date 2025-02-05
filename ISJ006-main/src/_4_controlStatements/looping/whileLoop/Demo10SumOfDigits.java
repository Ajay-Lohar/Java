package _4_controlStatements.looping.whileLoop;

import java.util.Scanner;

public class Demo10SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number > 0) {
            //take mod to get the last digit
            // add the digit to the sum
            //divide the number again
            int digit = number % 10;
            sumOfDigits = sumOfDigits + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits " + sumOfDigits);

    }
}
