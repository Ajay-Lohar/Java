package _3_operators;

public class ConditionalOperator6 {

	public static void main(String[] args){

			int number = 789898989;

			System.out.println( 

				(number%2==0 && number%3==0 )
				? "its divisible by both 2 & 3"
				: "its not divisible by both 2 & 3"

		);
	
	}

}