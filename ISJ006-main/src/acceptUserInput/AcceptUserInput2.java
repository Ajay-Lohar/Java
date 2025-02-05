package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two byte values");

		byte number1 = scanner.nextByte() ;
		byte number2 = scanner.nextByte() ;

		System.out.println("Addition of two numbers is "+(number1+number2));



	}

}