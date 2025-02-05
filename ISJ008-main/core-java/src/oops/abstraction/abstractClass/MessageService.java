package oops.abstraction.abstractClass;

abstract public class MessageService {

    // components
    int iv = 100;

    void im() {
        System.out.println("instance method");
    }

    {
        System.out.println("instance block");
    }

    MessageService() {
        System.out.println("Constructor");
    }

    class Inner {
    }

    static int sv = 200;

    static void sm() {
        System.out.println("static method");
    }

    static {
        System.out.println("static block");
    }

    abstract public void sendMessage();
}
