package _8_exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            System.out.println("try block");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main ");
    }
    // 10 finally  --> rest
}
