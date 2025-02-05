package _10_collectionFramework.java8Features;

import java.util.function.Consumer;

public class Demo7Consumer {
    public static void main(String[] args) {
        Consumer consumer = (input)-> System.out.println(input);
        consumer.accept("input provided to accept method");
    }
}
