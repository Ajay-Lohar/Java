package _3_operators.arithmeticOperators;

public class Demo5 {
    public static void main(String[] args) {
        int number = 12345;

        int digit = number % 10;
        number = number /10;
        System.out.println("Last digit "+digit);//5

         digit = number % 10;
        number = number /10;
        System.out.println("Last digit "+digit);//5
    }
}
