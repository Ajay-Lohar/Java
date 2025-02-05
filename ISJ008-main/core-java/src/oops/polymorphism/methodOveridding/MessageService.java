package oops.polymorphism.methodOveridding;

public class MessageService {
    public void sendMessage(String str) {
        System.out.println("message sent " + str);
    }

    public void receiveMessage() {
        System.out.println("message received ");
    }
}
