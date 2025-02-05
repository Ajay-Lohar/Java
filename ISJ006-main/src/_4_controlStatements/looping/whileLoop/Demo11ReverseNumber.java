package _4_controlStatements.looping.whileLoop;

import java.util.Scanner;

public class Demo11ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + sum);
    }
}
