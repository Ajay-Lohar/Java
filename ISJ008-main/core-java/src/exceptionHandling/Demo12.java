package exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        //generic exception handling
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (NullPointerException npe) {
            System.out.println("null reference");
        } catch (Exception exception) {
            System.out.println(" Issues is " + exception.getMessage());
        }
        System.out.println("rest of the main");
        //o/p : reference is null --> rest of the main
    }
}
