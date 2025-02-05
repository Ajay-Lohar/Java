package multithreading;

public class Demo18 {
    public static void main(String[] args) {
        class Addition {
            int counter;

            void increment() {
                counter = counter + 1;
            }

            void decrement() {
                counter = counter - 1;
            }
        }
        Addition addition = new Addition();
        Thread increment = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (long i = 1; i <= 100000000000L; i++) {
                addition.increment();
            }
        }, "increment");
        Thread decrement = new Thread(() -> {
            for (long i = 1; i <= 100000000000L; i++) {
                addition.decrement();
            }
        }, "decrement");
        increment.start();
        decrement.start();
        System.out.println("Counter " + addition.counter);
    }
}
