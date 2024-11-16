package ExceptionHandaling;

public class Demo3 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("****");
        }finally {
            System.out.println("finaly block excuted");
        }
        System.out.println("rest of the code");// won't be executed
    }
}
