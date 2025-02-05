package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("rest of the try");
        } catch (ArithmeticException exception) {
            System.out.println("invalid denominator");
        } finally {
            System.out.println("finally block will always be executed");
        }
        System.out.println("rest of the main");
        //catch block, finally block , rest of the main
    }
}
