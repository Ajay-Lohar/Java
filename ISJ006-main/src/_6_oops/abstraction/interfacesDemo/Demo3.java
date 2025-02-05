package _6_oops.abstraction.interfacesDemo;

public class Demo3 {
    //FI-SAM
    //functional interface : an interface which contains single abstract method and any number of static and default methods
    interface MessageService {
        void sendMessage(String message);
    }

    public static void main(String[] args) {
        //subclass creation of a functional interface
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message " + message);
            }
        }

        MessageService messageService = new MessageServiceImpl();

        messageService.sendMessage("subclass creation using traditional way");

    }
}
