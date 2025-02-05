package acceptUserInput;

import java.util.Scanner;

public class AcceptUserInput9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter character value");

		char value = scanner.next().charAt(0);
		
		System.out.println("Entered value is "+value);

	}

}