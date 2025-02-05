package multithreading;

public class Demo9 {
    public static void main(String[] args) {
        //# create a thread by extending a Thread class
        //1. create a subclass of type Thread
        //2. Override the run method
        //3. create the object of subclass
        //4. call the start method
        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();

        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
