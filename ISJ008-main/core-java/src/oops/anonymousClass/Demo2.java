package oops.anonymousClass;

public class Demo2 {
    public static void main(String[] args) {
        abstract class MessageService {
            abstract void sendMessage(String message);
        }

        class MessageServiceImpl extends MessageService {
            @Override
            void sendMessage(String message) {
                System.out.println("Method overridden " + message);
            }
        }
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("traditional way");


        //anonymous

        MessageService anonymous = new  MessageService() {
            @Override
            void sendMessage(String message) {
                System.out.println("Method overridden " + message);
            }
        };
        anonymous.sendMessage("anonymous");
    }
}
