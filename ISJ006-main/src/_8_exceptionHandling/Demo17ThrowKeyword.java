package _8_exceptionHandling;

public class Demo17ThrowKeyword {
    public static void main(String[] args) {
        //System.out.println(10/0);
        throw  new ArithmeticException("/ by zero");
        //System.out.println("rest of the main");
    }
}
