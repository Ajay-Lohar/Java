package misc.generics;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Addition<Integer, Integer> addition = new Addition();
        addition.add(100, 200);

        interface Predicate<T> {
            boolean test(T t);
        }
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(11));
        interface Consumer<T> {
            void accept(T t);
        }
        Consumer<Integer> consumer = (obj)-> System.out.println(obj);
        consumer.accept(100);
       // consumer.accept("abc");
    }
}
