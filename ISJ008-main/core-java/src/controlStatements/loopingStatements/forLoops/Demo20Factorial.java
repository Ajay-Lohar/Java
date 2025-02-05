package controlStatements.loopingStatements.forLoops;

public class Demo20Factorial {
    public static void main(String[] args) {
        int number = 6;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
//            factorial = factorial*  i;
        }
        System.out.println("Factorial is " + factorial);
    }
}
