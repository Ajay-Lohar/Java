package oops.java8Features.lambdaExpression;

public class Demo1 {
    public static void main(String[] args) {
        interface NumberProcessor {
            int process(int number);
        }
        NumberProcessor numberProcessor = number -> number * number;
        System.out.println(numberProcessor.process(10));
    }
}
