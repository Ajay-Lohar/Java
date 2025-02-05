package oops.abstraction.interfaceDemo;

public class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("sending message");
    }

    public static void main(String[] args) {
        MessageService messageService =  new MessageServiceImpl();
        MessageService messageService1 =  new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("annonymous");
            }
        };
        MessageService messageService2 = () -> System.out.println("annonymous");

        messageService.sendMessage();
    }
}
