package multithreading;

public class Demo17 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "t1");
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "t2");
        Thread thread3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "t3");

        thread1.setPriority(10);
        thread2.setPriority(10);
        thread3.setPriority(10);

        //main thread is ready to give up the execution for other thread with more or same priority
        Thread.yield();

        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("Main method " + Thread.currentThread().getName());
    }
}
