package controlStatements.loopingStatements.forLoops;

public class Demo21Factorial {
    public static void main(String[] args) {
        int number = 6;
        int factorial = 1;
        for (int i = 6; i >= 1; i--) {
            factorial *= i;
//            factorial = factorial*  i;
        }
        System.out.println("Factorial is " + factorial);
    }
}
