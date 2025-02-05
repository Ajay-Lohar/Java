package controlStatements.decisionMaking.ifElse;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers");
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        long number3 = scanner.nextLong();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is max");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is max");
        } else {
            System.out.println(number3 + " is max");
        }

    }
}
