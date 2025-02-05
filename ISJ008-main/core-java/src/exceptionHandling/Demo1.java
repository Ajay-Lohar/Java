package exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        //try catch finally, throw, throws
        //Throwable
        //Exception extends Throwable
        //Error extends Throwable
        //RuntimeException extends Exception
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println(10/0);
        System.out.println("statement 3");
    }
}
