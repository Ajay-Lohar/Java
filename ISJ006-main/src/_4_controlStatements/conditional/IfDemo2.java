package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number ");
        } else {
            System.out.println(number + " is odd number ");
        }
    }
}
