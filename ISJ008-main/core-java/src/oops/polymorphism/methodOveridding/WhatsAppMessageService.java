package oops.polymorphism.methodOveridding;

public class WhatsAppMessageService extends MessageService {

    @Override
    public void sendMessage(String str) {
        System.out.println("message sent using whatsApp "+str);
    }
}
