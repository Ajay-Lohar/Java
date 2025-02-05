package inputAccept;

import java.util.Scanner;

public class Demo11MinOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers");
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        long number3 = scanner.nextLong();
        System.out.println("Minimum of three is " +
                ((number1 < number2 && number1 < number3) ? number1
                        : (number2 < number1 && number2 < number3 ? number2 : number3)
                ));

    }
}
