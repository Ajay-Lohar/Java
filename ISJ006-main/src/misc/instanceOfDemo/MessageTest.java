package misc.instanceOfDemo;

public class MessageTest {
    static class WhatsAppService implements MessageService {
        @Override
        public void sendMessage() {
            System.out.println("sending whatsApp");
        }
    }

    static class SmsService implements MessageService {
        @Override
        public void sendMessage() {
            System.out.println("sending sms");
        }
    }

    static class EmailService implements MessageService {
        @Override
        public void sendMessage() {
            System.out.println("sending Email");
        }
    }

    public static void main(String[] args) {

        MessageService whatsApp = new WhatsAppService();
        MessageService sms = new SmsService();
        MessageService email = new EmailService();
        checkMessage(sms);

    }

    private static void checkMessage(MessageService messageService) {
        if (messageService instanceof WhatsAppService) {
            System.out.println("message will be sent though whatsApp");
        }
        if (messageService instanceof SmsService) {
            System.out.println("message will be sent though Sms");
        }
        if (messageService instanceof EmailService) {
            System.out.println("message will be sent though Email");
        }
    }

}
