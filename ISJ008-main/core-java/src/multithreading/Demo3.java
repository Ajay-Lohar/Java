package multithreading;

public class Demo3 {
    public static void main(String[] args) {

        //1. by extending Thread class
        class Worker extends Thread {

            //run method is a job of worker thread
            @Override
            public void run() {
                for (int i = 11; i <= 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "\t" + i);
                }
            }
        }

        Worker worker = new Worker();
        worker.setName("Worker");

        worker.start();

        //main method
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}
