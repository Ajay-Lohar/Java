package ControlStatements.Loops;

public class Demo8DivisionWithoutOperator {
    public static void main(String[] args) {
        int  number1 = 23 ;
        int  number2 = 6 ;
        int sub = 0 ;
        for(;number2<=number1;){
            number1 = number1 - number2;
            sub++;
        }
        System.out.println("Quotient: "+sub);
        System.out.println("Remainder : "+number1);
    }
}
