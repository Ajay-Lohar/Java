package inputAccept;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value");
        String string = scanner.nextLine();
        System.out.println("You have entered " + string);
    }
}
