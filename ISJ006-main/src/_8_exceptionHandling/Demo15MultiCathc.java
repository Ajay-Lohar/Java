package _8_exceptionHandling;

public class Demo15MultiCathc {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println("string length is " + str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid denominator or null reference or index not in range");
        }
    }
}
