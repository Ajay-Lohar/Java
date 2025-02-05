package inputAccept;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value");
        String string = scanner.next();
        System.out.println("You have entered " + string);
    }
}
