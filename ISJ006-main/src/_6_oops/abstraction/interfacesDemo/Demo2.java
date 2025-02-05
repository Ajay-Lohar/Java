package _6_oops.abstraction.interfacesDemo;

public class Demo2 {
    interface MessageService {
        void sendMessage(String message);
    }


    public static void main(String[] args) {
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message " + message);
            }
        }

        MessageService messageService = new MessageServiceImpl();

        messageService.sendMessage("Good morning");

    }

}
