package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two short values");

		short number1 = scanner.nextShort() ;
		short number2 = scanner.nextShort() ;

		System.out.println("Addition of two numbers is "+(number1+number2));



	}

}