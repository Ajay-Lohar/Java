package _8_exceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println("string length is " + str.length());
            int[] array = {1};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        } catch (NullPointerException npe) {
            System.out.println("null reference");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("index not in the range");
        }
    }
}
