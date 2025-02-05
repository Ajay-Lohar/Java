package inputAccept;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean type value");
        boolean nextBoolean = scanner.nextBoolean();
        System.out.println("boolean value entered is " + nextBoolean);
    }


}
