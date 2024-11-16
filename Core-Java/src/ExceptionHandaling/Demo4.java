package ExceptionHandaling;

public class Demo4 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("****");
        }catch (NullPointerException nullPointerException){
            System.out.println("handles NPE");// thise exception is not handle

        } finally{
            System.out.println("finaly block excuted");
        }
        System.out.println("rest of the code");// won't be executed
    }
}
