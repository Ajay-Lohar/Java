package exceptionHandling;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age< 0 || age > 150){
            throw new InvalidAgeException("age is not valid");
        }
        System.out.println("Your eligible");
    }
}
