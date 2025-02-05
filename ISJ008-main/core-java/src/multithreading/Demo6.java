package multithreading;

public class Demo6 {
    public static void main(String[] args) {
        //2. by implementing the Runnable interface

        //1. create a subclass of type Runnable
        //2. override the run method
        //3. create object of subclass
        //4. create object of Thread class by passing subclass reference as constructor parameter
        //5. call the start method by using thread object reference
        Runnable runnable = () -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("lambda-worker");
        thread.start();

    }
}
