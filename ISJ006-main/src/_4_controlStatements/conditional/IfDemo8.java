package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo8 {

	public static void main(String[] args){

		System.out.println("Enter a year ");

		Scanner scanner = new Scanner(System.in);
	
		int year = scanner.nextInt();
			
		boolean isLeapYear = year % 400==0 || (year %100!=0 && year%4==0);
	
		if( isLeapYear){
			System.out.println(year+" is leap year");

		}

		else {
			System.out.println(year+" is not a leap year");

		}

	}

}