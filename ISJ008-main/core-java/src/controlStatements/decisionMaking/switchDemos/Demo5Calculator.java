package controlStatements.decisionMaking.switchDemos;

import java.util.Scanner;

public class Demo5Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println("Addition is " + (number1 + number2));
            case '-' -> System.out.println("Sub is " + (number1 - number2));
            case '*' -> System.out.println("Mul is " + (number1 * number2));
            case '/' -> System.out.println("Division Q is " + (number1 / number2));
            case '%' -> System.out.println("Division remainder is " + (number1 % number2));
            default -> System.out.println("Invalid operator");
        }
    }
}

