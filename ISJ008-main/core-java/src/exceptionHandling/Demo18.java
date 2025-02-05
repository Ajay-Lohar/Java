package exceptionHandling;

public class Demo18 {
    public static void main(String[] args) {
       // System.out.println(10/0);
        System.out.println("rest of the main");
        throw new ArithmeticException(" / by zero");
    }
}
