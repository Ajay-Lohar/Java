package java8Features.lambdaExpression;

public class Demo3 {

    @FunctionalInterface
    interface NumberProcessor {
        int process(int number);
    }

    public static void main(String[] args) {
        NumberProcessor sqrt = (number) -> number * number;
        NumberProcessor cube = (number) -> number * number * number;
        System.out.println(sqrt.process(10));
        System.out.println(cube.process(10));
    }
}
