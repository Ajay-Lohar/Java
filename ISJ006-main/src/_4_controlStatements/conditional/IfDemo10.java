package _4_controlStatements.conditional;

import java.util.Scanner;

public class IfDemo10 {

	public static void main(String[] args){

		System.out.println("Enter a number less than 10");

		Scanner scanner = new Scanner(System.in);
	
		int number = scanner.nextInt();

		// 1,2,3,4,5
		if(number%1==0){
			System.out.println(1);
		}

		if(number%2==0){
			System.out.println(2);
		}
			
		if(number%3==0){
			System.out.println(3);
		}
	

		if(number%4==0){
			System.out.println(4);
		}
			
		if(number%5==0){
			System.out.println(5);
		}
	
		

	}

}