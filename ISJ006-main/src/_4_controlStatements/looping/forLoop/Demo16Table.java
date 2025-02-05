package _4_controlStatements.looping.forLoop;

import java.util.Scanner;

public class Demo16Table {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }

    }
}
