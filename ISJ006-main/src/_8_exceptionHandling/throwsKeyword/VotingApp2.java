package _8_exceptionHandling.throwsKeyword;

import _8_exceptionHandling.InvalidAgeException;

import java.util.Scanner;

public class VotingApp2 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18){
            try {
                throw new InvalidAgeException("Invalid age");
            } catch (InvalidAgeException e) {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("You are eligible for vote");
        }
    }
}
