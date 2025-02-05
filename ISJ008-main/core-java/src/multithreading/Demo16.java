package multithreading;

public class Demo16 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(5000);
                for (int i = 11; i <= 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, "worker");
        worker.start();
        worker.join(100000);
        // we want main thread to wait for the worker thread execution completion
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
