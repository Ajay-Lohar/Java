package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("Enter the month number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Jan");
        }
        if (number == 2) {
            System.out.println("Feb");
        }
        if (number == 3) {
            System.out.println("Mar");
        }
        if (number == 4) {
            System.out.println("Apr");
        }
        if (number == 5) {
            System.out.println("May");
        }
        if (number == 6) {
            System.out.println("Jun");
        }
        if (number == 7) {
            System.out.println("July");
        }
        if (number == 8) {
            System.out.println("Aug");
        }
        if (number == 9) {
            System.out.println("Sept");
        }
        if (number == 10) {
            System.out.println("Oct");
        }
        if (number == 11) {
            System.out.println("Nov");
        }
        if (number == 12) {
            System.out.println("Dec");
        }
        if (number < 1 || number > 12) {
            System.out.println("Invalid month");
        }
    }
}
