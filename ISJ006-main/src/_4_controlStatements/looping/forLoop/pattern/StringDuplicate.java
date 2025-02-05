package _4_controlStatements.looping.forLoop.pattern;

import java.util.HashSet;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = "hello hello hello good morning";
        String[] words = str.trim().split(" ");
        HashSet<String> hashSet = new HashSet();
        for (String word : words) {
            hashSet.add(word);
        }
        System.out.println(hashSet);
    }
}
