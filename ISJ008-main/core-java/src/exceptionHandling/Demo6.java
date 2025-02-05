package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->System.out.println(10/0));
        thread1.start();
        System.out.println("rest of the main method");
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
