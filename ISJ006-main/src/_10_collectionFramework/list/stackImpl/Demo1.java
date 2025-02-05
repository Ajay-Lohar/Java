package _10_collectionFramework.list.stackImpl;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(199);
        stack.push(1);
        stack.push(10);
        stack.push(1010);
        stack.push(101);
        System.out.println("Size of the stack "+stack.size());
        System.out.println("Top of stack "+stack.peek());
        System.out.println("Element is "+stack.pop());
        System.out.println("Element is "+stack.pop());
        System.out.println("Element is "+stack.pop());
        System.out.println("Element is "+stack.pop());
        System.out.println("Element is "+stack.pop());
        System.out.println("Element is "+stack.pop());
        System.out.println("Is Stack empty "+stack.isEmpty());
        System.out.println("Element is "+stack.pop());
    }
}
