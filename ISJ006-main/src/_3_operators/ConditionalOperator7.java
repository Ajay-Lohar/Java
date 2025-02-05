package _3_operators;

public class ConditionalOperator7 {

	public static void main(String[] args){

			int number = 221;

			System.out.println( 

				(number%13==0 && number%17==0 )
				? "its divisible by both 13 & 17"
				: "its not divisible by both 13 & 17"

		);
	
	}

}