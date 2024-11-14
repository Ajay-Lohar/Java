package java8features;

public class Demo06 {
    public static void main(String[] args) {

        //1.traditional way
        class Worker  implements Runnable{
            @Override
            public void run(){
                System.out.println("Runnable Traditional way");
            }

        }
        Runnable runnable =new Worker();
        runnable.run();

        Runnable anonomous = new Runnable(){
            @Override
            public void run() {
                System.out.println("Runable implementation using Anonomous class");
            }
        };
        anonomous.run();


        //3.lambda Expression Way
        Runnable lambda =() ->{ System.out.println("Runable  using lambda expression");};
        lambda.run();
    }
}
