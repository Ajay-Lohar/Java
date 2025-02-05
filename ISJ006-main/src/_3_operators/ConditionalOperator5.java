package _3_operators;

public class ConditionalOperator5 {

	public static void main(String[] args){

			int year = 2000;

			

			System.out.println(
			
			(year % 400 == 0) || (year%4==0 && year%100 !=0)
 				?"its leap number" 
				: "its not a leap year");
	
	}

}