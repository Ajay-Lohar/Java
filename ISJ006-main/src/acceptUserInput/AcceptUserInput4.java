package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two long values");

		long number1 = scanner.nextLong() ;
		long number2 = scanner.nextLong() ;

		System.out.println("Addition of two numbers is "+(number1+number2));



	}

}