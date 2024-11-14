package ClassComponants.Methods;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second  Number ");
        int number2 = sc.nextInt();
        System.out.println("Enter the Third Number ");
        int number3 = sc.nextInt();
        System.out.println("Maximum Of three Numbers "+ Demo1.maxOfThree(number1,number2,number3));
        System.out.println("Minimum Of three Numbers "+ Demo1.minOfThree(number1,number2,number3));
    }
    public static int maxOfThree(int number1 ,int number2 , int number3){
        return number1 >number2 && number1 > number3 ? number1 :
                number2 >number1 && number2 >number3 ? number2 : number3 ;
    }
    public static int minOfThree(int number1 ,int number2 , int number3){
        return number1 <number2 && number1 < number3 ? number1 :
                number2 <number1 && number2 <number3 ? number2 : number3 ;
    }
}

