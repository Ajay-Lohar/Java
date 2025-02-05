package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (NullPointerException nullPointerException) {
            System.out.println("reference is null");
        }
        System.out.println("rest of the main");
        //o/p : reference is null --> rest of the main
    }
}
