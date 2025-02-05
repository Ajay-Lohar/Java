package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter String value");

		String value = scanner.nextLine();
		
		System.out.println("Entered value is "+value);



	}

}