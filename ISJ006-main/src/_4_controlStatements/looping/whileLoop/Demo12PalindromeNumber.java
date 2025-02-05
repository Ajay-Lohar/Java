package _4_controlStatements.looping.whileLoop;

import java.util.Scanner;

public class Demo12PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + reverseNumber);
        System.out.println(originalNumber == reverseNumber ? "Palindrome" : "not a palindrome");

    }
}
