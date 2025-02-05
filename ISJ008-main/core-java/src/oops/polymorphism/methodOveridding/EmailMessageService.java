package oops.polymorphism.methodOveridding;

public class EmailMessageService extends MessageService {

    @Override
    public void sendMessage(String str) {
        System.out.println("message sent using email" + str);
    }

    @Override
    public void receiveMessage() {
        System.out.println("message received using email ");
    }
}
