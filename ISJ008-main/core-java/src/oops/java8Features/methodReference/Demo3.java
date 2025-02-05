package oops.java8Features.methodReference;

public class Demo3 {
    public static void main(String[] args) {
        interface Number {
            void add(int number1, int number2);
        }
        //1. lambda expression
        Number lambda = (number1, number2) -> System.out.println(number1 + number2);
        lambda.add(1002, 2000);


        //2. method reference : constructor
        Number methodRef = Demo3::new;
        methodRef.add(500, 900);


    }

    public Demo3(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
