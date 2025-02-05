package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo5 {

	public static void main(String[] args){

		System.out.println("Enter two numbers ");

		Scanner scanner = new Scanner(System.in);
	
		int number1 = scanner.nextInt();

		int number2 = scanner.nextInt();

		if( number1 > number2){
			System.out.println(number1+" is greater than "+number2);

		}

		if( number2 > number1){
			System.out.println(number2+" is greater than "+number1);

		}

	}

}