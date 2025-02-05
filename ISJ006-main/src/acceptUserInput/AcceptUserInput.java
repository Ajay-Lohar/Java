package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers");

		int number1 = scanner.nextInt() ;
		int number2 = scanner.nextInt() ;

		System.out.println("Addition of two numbers is "+(number1+number2));



	}

}