package _6_oops.abstraction;

public abstract class MessageService {

     abstract void sendMessage(String str);

    public static void main(String[] args) {

        class Child extends MessageService {
            @Override
            void sendMessage(String str) {
                System.out.println("sending message " + str);
            }
        }

        MessageService messageService = new Child();
        messageService.sendMessage("hello");
    }
}
