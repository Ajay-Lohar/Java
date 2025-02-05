package multithreading;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.ToString;

public class Demo20 {
    public static void main(String[] args) {

        @ToString
        class Message {
            @SneakyThrows
            synchronized void sendMessage() {
                //Thread.sleep(10000);
                System.out.println("sending the message " + Thread.currentThread().getName());
                wait();
                System.out.println("send message method resumed");
            }

            @SneakyThrows
            synchronized void receiveMessage() {
                //Thread.sleep(10000);
                System.out.println("receiving the message " + Thread.currentThread().getName());
                notify();
            }
        }
        Message message = new Message();
        Thread sender = new Thread(() -> message.sendMessage(), "sender");
        Thread receiver = new Thread(() -> message.receiveMessage(), "receiver");
        sender.start();
        receiver.start();
    }
}
