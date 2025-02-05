package _10_collectionFramework.java8Features;

import java.util.function.Predicate;

public class Demo5Predicate {
    public static void main(String[] args) {
        Predicate<String> predicate = (str)->str.contains("a");
        System.out.println(predicate.test("welcome"));//false
        System.out.println(predicate.test("it shaala"));//true
    }
}
