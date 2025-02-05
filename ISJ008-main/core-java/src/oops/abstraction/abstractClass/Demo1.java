package oops.abstraction.abstractClass;

public class Demo1 {
    public static void main(String[] args) {
        //MessageService messageService = new MessageService();///cant instantiate abstract class and interface
        class MessageServiceImpl extends MessageService{
            @Override
            public void sendMessage() {
                System.out.println("method overridden");
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
