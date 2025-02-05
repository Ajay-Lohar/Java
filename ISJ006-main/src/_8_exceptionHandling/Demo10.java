package _8_exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main ");
    }
    // catch finally rest
}
