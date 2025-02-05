package _8_exceptionHandling.throwsKeyword;

public class Demo1 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException e) {
            System.out.println("handled in main method : invalid denominator");
        }
        System.out.println("Rest of the main");
    }

    public static void m1() {
        System.out.println(10 / 0);
    }
}
