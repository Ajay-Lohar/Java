package _3_operators.arithmeticOperators;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 / 1);//10
        System.out.println(10 % 1);//0
        System.out.println(1 / 10);//0
        System.out.println(1 % 10);//1

       // System.out.println(10 / 0); //ArithmeticException divide by zero
       // System.out.println(10 % 0);//ArithmeticException divide by zero
        System.out.println(10.0 / 0); //Infinity
        System.out.println(10.0 % 0); //NaN
    }
}
