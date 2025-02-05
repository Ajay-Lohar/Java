package oops.anonymousClass;

public class Demo3 {
    public static void main(String[] args) {
        interface MessageService {
            void sendMessage(String message);
        }

        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("Method overridden " + message);
            }
        }
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("traditional way");


        //anonymous

        MessageService anonymous = new MessageService() {
            @Override
            public void sendMessage(String message) {
                System.out.println("Method overridden " + message);
            }
        };
        anonymous.sendMessage("anonymous");
    }
}
