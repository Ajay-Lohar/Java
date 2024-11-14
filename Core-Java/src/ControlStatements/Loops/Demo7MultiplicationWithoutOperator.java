package ControlStatements.Loops;

public class Demo7MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 5 ;
        int number2 = 20 ;
        int sum = 0;
        for(int i = 1 ; i<=number1;i++){
            sum = sum + number2 ;
        }
        System.out.println("Multiplication " + sum);
    }
}
//output :-
//200