package _4_controlStatements.looping.forLoop;

import java.util.Scanner;

public class Demo20Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + factorial);
    }
}
