package java8Features.lambdaExpression;

public class Demo4 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("running");
        runnable.run();
    }
}
