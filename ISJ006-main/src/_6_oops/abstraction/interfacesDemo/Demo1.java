package _6_oops.abstraction.interfacesDemo;

public class Demo1 {
    interface MessageService {
        public static final int a = 10;
        public abstract void sendMessage(String message);

        public static class Demo{}

        public static void main(String[] args) {
            System.out.println("interface main method");
        }

    }
}
