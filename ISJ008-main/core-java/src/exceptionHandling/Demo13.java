package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        //multi catch
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | NullPointerException arithmeticException) {
            System.out.println("invalid denominator or null pointer");
        } catch (Exception exception) {
            System.out.println(" Issues is " + exception.getMessage());
        }
        System.out.println("rest of the main");
        //o/p : reference is null --> rest of the main
    }
}
