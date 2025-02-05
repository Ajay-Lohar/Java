package inputAccept;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of type short");
        short nextShort = scanner.nextShort();
        System.out.println("Short value entered is " + nextShort);
    }


}
