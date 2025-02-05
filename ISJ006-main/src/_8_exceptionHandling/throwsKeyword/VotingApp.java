package _8_exceptionHandling.throwsKeyword;

import _8_exceptionHandling.InvalidAgeException;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18){
            throw new InvalidAgeException("Invalid age");
        } else {
            System.out.println("You are eligible for vote");
        }
    }
}
