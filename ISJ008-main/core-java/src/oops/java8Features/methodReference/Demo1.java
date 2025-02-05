package oops.java8Features.methodReference;

public class Demo1 {
    public static void main(String[] args) {
        interface Number {
            int add(int number1, int number2);
        }
        //1. lambda expression
        Number lambda = (number1, number2) -> number1 + number2;
        System.out.println(lambda.add(100, 200));

        Number methodRef = Demo1::addTwoNumbers;
        System.out.println(methodRef.add(100,200));


    }

    public static int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
