package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo9 {

	public static void main(String[] args){

		System.out.println("Enter a number ");

		Scanner scanner = new Scanner(System.in);
	
		int number = scanner.nextInt();
			
	
		if( number%13==0 && number%17==0 ){
			System.out.println(number+" is divisible by both 13 and 17");

		}

		else {
			System.out.println(number+" is not divisible by both 13 and 17");

		}

	}

}