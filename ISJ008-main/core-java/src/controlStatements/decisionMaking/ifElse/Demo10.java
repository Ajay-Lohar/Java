package controlStatements.decisionMaking.ifElse;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("Enter your salary and years of service");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int yearsOfService = scanner.nextInt();
        float bonus = 0.0f;
        if (yearsOfService >= 5) {
            bonus = salary * 0.5f;
        }
        System.out.println("Your net bonus is " + bonus);
    }
}
