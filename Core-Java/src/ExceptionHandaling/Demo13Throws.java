package ExceptionHandaling;

public class Demo13Throws {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
    }
    //un-checked exception are implicitly propagated to caller method. no need of throws
    private static int divide(int number1, int number2)  {
        int division = number1 / number2;
        return division;
    }
}
