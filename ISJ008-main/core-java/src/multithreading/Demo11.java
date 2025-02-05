package multithreading;

public class Demo11 {
    public static void main(String[] args) {
        //# creating threads using Runnable interface
        //1. create a subclass of type Runnable [traditional, anonymous, lambda, method reference]
        //2. override the run method to write the job of thread
        //3. create the object of subclass
        //4. create the object of Thread class and pass the subclass object to its constructor
        //5. call the start method using thread class reference

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("worker");
        thread.start();

    }
}
