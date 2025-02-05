package _4_controlStatements.looping.forLoop;

import java.util.Scanner;

public class Demo22PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "prime" : "not a prime");
    }
}
