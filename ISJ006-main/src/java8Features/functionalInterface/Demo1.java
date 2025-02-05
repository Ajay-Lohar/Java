package java8Features.functionalInterface;

public class Demo1 {

    interface I {
        void sendMessage(String str);
    }

    public static void main(String[] args) {
        class B implements I {
            @Override
            public void sendMessage(String str) {
                System.out.println("sending the message " + str);
            }
        }

        I i = new B();
        i.sendMessage("Good evening");
    }
}
