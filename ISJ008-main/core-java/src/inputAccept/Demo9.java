package inputAccept;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //max of two numbers
        System.out.println("enter two numbers");
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        System.out.println(
                number1 > number2 ? number1 : number2
        );

    }
}
