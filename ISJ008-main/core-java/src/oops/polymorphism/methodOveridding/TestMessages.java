package oops.polymorphism.methodOveridding;

public class TestMessages {
    public static void main(String[] args) {
        MessageService messageService = new WhatsAppMessageService();
        messageService.sendMessage("hello");
    }
}
