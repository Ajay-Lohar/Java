package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two float values");

		float number1 = scanner.nextFloat() ;
		float number2 = scanner.nextFloat() ;

		System.out.println("Addition of two numbers is "+(number1+number2));



	}

}