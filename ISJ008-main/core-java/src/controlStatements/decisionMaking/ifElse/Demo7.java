package controlStatements.decisionMaking.ifElse;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        //accept length and breadth and check if it is square
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        if (length == breadth) {
            System.out.println("its a square");
        } else {
            System.out.println("its not a square");
        }
    }
}
