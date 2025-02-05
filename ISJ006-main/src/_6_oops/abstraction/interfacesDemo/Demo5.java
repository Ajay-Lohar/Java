package _6_oops.abstraction.interfacesDemo;

public class Demo5 {
    //FI-SAM
    //functional interface : an interface which contains single abstract method and any number of static and default methods
    interface MessageService {
        void sendMessage(String message);
    }

    public static void main(String[] args) {
        //subclass creation of a functional interface


        MessageService messageService = message -> System.out.println("sending message " + message);

        messageService.sendMessage("subclass creation using lambda way");

    }
}
