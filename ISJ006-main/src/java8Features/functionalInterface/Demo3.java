package java8Features.functionalInterface;

public class Demo3 {

    @FunctionalInterface
    interface MessageService {
        void sendMessage(String message);
    }


    public static void main(String[] args) {
        class WhatsAppMessage implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message through whatsApp " + message);
            }
        }

        class FacebookMessage implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message through facebook " + message);
            }
        }

        MessageService messageService = new FacebookMessage();
        messageService.sendMessage("good morning");
    }
}
