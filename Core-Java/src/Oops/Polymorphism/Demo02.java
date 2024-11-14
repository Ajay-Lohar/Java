package Oops.Polymorphism;

public class Demo02 {
    public static void main(String[] args) {
        class MessageService{
            void sendMessage(String massage){
                System.out.println(" send massege using Text from MessageServive");
            }

        }
        class EmailServive extends MessageService{
            void sendMessage(String massage){
                System.out.println(" send massege using email from MessageServive");
            }
        }
        class WhatsAppService extends EmailServive{
            void sendMessage(String massage){
                System.out.println(" send massege using Whatsapp from MessageServive");
            }
        }
    }
}
