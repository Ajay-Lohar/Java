package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter boolean value");

		boolean value = scanner.nextBoolean();
		
		System.out.println("Entered value is "+value);



	}

}