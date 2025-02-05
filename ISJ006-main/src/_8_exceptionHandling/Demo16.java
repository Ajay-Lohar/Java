package _8_exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println("string length is " + str.length());
            int[] array = {0};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        } catch (Throwable exception) {
            System.out.println("generic handler");
        }

    }

}
