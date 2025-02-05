package _4_controlStatements.looping.doWhileLoop;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
            System.out.println("you have entered the character " + ch);
        } while (ch != 'X');
        //10 !=10 --> X!=X
    }
}
