package exceptionHandling;

public class Demo15Throws {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("exception handled in main method");
        }
        System.out.println("rest of the main method");
    }

    private static int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }
}
