package inputAccept;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //max of two numbers
        System.out.println("enter three numbers");
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        long number3 = scanner.nextLong();
        System.out.println(
                (number1 > number2 && number1 > number3) ? number1
                        : (number2 > number1 && number2 > number3 ? number2 : number3)
        );

    }
}
