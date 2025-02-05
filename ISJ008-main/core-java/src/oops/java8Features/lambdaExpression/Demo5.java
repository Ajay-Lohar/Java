package oops.java8Features.lambdaExpression;

public class Demo5 {
    public static void main(String[] args) {
        interface Number {
            void process(int number);
        }
//        Number number = num -> System.out.println("you have given "+num);
        Number number = System.out::println;
        number.process(1000);
    }
}
