package _8_exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println(getInt());//3
    }

    private static int getInt() {
        try {
            return 1;
        } catch (ArithmeticException a) {
            return 2;
        } finally {
            return 3;
        }
    }
}
