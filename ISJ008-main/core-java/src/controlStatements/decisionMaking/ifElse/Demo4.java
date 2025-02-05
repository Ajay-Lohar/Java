package controlStatements.decisionMaking.ifElse;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("its even number.. " + number);
        }
        //System.out.println("independent statement");
        else {
            System.out.println("its an odd number.. " + number);
        }
    }
}
