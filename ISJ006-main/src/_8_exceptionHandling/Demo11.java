package _8_exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("try");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main ");
    }
    //  finally  --> AE
}
