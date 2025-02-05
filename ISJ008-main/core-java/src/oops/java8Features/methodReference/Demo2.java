package oops.java8Features.methodReference;

public class Demo2 {
    public static void main(String[] args) {
        interface Number {
            int add(int number1, int number2);
        }
        //1. lambda expression
        Number lambda = (number1, number2) -> number1 + number2;
        System.out.println(lambda.add(500, 900));


        Demo2 demo2 = new Demo2();

        Number methodRef = demo2::addTwoNumbers;
        System.out.println(methodRef.add(500, 900));


    }

    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
