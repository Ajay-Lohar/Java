package exceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
        //o/p : NUllPointerException
    }
}
