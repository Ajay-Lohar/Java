package PracticeExtraQ;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt() ;
        boolean isPrime = true;
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime Number \t"+number);
        }
        else{
            System.out.println("Not Prime Number \t"+number);
        }
    }
}
