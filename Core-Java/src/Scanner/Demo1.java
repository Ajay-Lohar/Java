package Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
     Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter the first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter the second2 number");
        int num2 = scanner.nextInt();

        System.out.println("print the number values");

        System.out.println("the First number is "+num1);
        System.out.println("the Second number is "+num2);

    }
}
