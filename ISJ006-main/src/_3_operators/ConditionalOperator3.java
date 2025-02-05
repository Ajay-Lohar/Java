package _3_operators;

public class ConditionalOperator3 {

	public static void main(String[] args){

			int number1 = 3000;
			int number2 = 4000;
			int number3 = 2000;
			
		System.out.println(

			number1 > number2 && number1 > number3 
			? number1
			: number2 > number1 && number2 > number3 
				? number2
				: number3  

		);
	}

}