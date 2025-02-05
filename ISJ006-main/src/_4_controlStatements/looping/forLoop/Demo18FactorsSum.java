package _4_controlStatements.looping.forLoop;

import java.util.Scanner;

public class Demo18FactorsSum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("sum of factors " + sum);
        System.out.println(sum == number ? "its a perfect number" : "its not a perfect number");
        // sum of factors == given number --> perfect number
    }
}
