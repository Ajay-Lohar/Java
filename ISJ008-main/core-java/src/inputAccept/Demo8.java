package inputAccept;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value");
        String string = scanner.next();
        char ch = string.charAt(0);
        System.out.println("You have entered string " + string);
        System.out.println("You have entered a character " + ch);
    }
}
