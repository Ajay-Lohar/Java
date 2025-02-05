package java8Features.functionalInterface;

public class Demo4 {

    @FunctionalInterface
    interface MessageService {
        void sendMessage(String message);
    }


    public static void main(String[] args) {

        MessageService messageService = new MessageService() {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message through facebook " + message);
            }
        };
        messageService.sendMessage("good morning");
    }
}
