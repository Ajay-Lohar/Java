package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("statement1");
        try{
            System.out.println(10 / 0);
        }catch (ArithmeticException exception){
            System.out.println("invalid denominator");
        }
        System.out.println("statement3");
        System.out.println("statement4");
    }
}
