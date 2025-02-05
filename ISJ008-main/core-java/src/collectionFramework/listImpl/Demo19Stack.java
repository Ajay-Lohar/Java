package collectionFramework.listImpl;

import java.util.Stack;

public class Demo19Stack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("mind away");
        books.push("Ikigai");
        books.push("Atomic Habits");
        books.push("The Secret");
        books.push("The Comfortzone");
        books.push("Harry Potter");
        books.push("Wings of Fire");
        books.push("Alchemist");
        books.push("Shaala");
        System.out.println("what is on top of stack "+books.peek());
        System.out.println("size of the book stack "+books.size());
    }
    //
}
