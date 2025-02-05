package _4_controlStatements.conditional;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.println("Enter the digit");
        Scanner scanner = new Scanner(System.in);
        char digit = scanner.next().charAt(0);

        if (digit == '0') {
            System.out.println("zero");
        }
        if (digit == '1') {
            System.out.println("One");
        }
        if (digit == '2') {
            System.out.println("Two");
        }
        if (digit == '3') {
            System.out.println("Three");
        }
        if (digit == '4') {
            System.out.println("Four");
        }
        if (digit == '5') {
            System.out.println("Five");
        }
        if (digit == '6') {
            System.out.println("six");
        }
        if (digit == '7') {
            System.out.println("Seven");
        }
        if (digit == '8') {
            System.out.println("Eight");
        }
        if (digit == '9') {
            System.out.println("Nine");
        }
        if (digit < '0' || digit > '9') {
            System.out.println("Invalid digit");
        }
    }
}
