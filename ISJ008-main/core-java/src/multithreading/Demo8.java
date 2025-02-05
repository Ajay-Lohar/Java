package multithreading;

public class Demo8 {
    static long sum = 0L;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (long i = 1; i <= 2500; i++) {
                sum += i;
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //main thread
        for (long i = 2501; i <= 5000L; i++) {
            sum += i;
        }
        thread.join();
        System.out.println(sum);

    }
}
