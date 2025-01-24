package ControlStatements.Loops;

public class Demo19FactorialRange {
    public static void main(String[] args) {

        for (int number = 1; number <=10 ; number++) {
            int fact =1;
            for (int i = 1; i <=number ; i++) {
                fact = fact * i ;
            }
            System.out.println("number "+ number +" factorial is " + fact);
        }
    }
}
//  6 = 1*2*3*4*5*6 = 720 --> like thise
