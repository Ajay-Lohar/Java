package ExceptionHandaling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("invalid denominator");
            }
            System.out.println("try");
        } catch (ArithmeticException ae) {
            System.out.println("catch block");// thise will be not executed
        }
        /*
        output:
        1. invalid denominator
        2. try
        * */
    }
}
