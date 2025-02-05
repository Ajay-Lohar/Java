package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("rest of the try");
        } finally {
            System.out.println("finally block will always be executed");
        }
        System.out.println("rest of the main");
        //this will be abnormal termination
    }
}
