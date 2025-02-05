package multithreading;

public class Demo14 {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 0; i <= 100; i = i + 2) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "even");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 100; i = i + 2) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "odd");
        //even.setName("even");
        //odd.setName("odd");
        even.start();
        odd.start();
    }
}
