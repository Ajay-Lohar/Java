package _10_collectionFramework.java8Features;

public class Demo6Consumer {
    interface Consumer {
        void accept(int number);
    }

    public static void main(String[] args) {
       // Consumer consumer = (number) -> System.out.println(number);
        Consumer consumer = System.out::println;
        consumer.accept(100);
    }
}
