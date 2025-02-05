package _4_controlStatements.looping.whileLoop;

import java.util.Scanner;

public class Demo9SumOfDigits {
    public static void main(String[] args) {
        int number = 4532;

        //take mod
        //divide the number
        int sum = 0;

        int digit = number % 10;
        sum = sum + digit;
        System.out.println(digit);//4532%10 =--->2
        number = number / 10; //4532/10 ---> 453

        digit = number % 10;
        sum = sum + digit;
        System.out.println(digit);// 453 % 10 ---> 3
        number = number / 10; // 453 /10 ---> 45

        digit = number % 10;
        sum = sum + digit;
        System.out.println(digit);//45 % 10 ----> 5
        number = number / 10;   // 45 / 10 ----> 4

        digit = number % 10;
        sum = sum + digit;
        System.out.println(digit);// 4 % 10 ---> 4
        number = number / 10; // 4/10 ---> 0

        System.out.println("Sum of digits "+sum);

    }
}
