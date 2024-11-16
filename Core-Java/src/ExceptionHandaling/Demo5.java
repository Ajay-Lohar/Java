package ExceptionHandaling;

public class Demo5 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("****");
        }catch (ArithmeticException arithmeticException){
            System.out.println("invalid  denominator");// thise exception is  handle

        } finally{
            System.out.println("finaly block excuted");
        }
        System.out.println("rest of the code");// won't be executed
    }
}
