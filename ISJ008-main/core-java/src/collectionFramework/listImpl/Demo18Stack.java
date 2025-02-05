package collectionFramework.listImpl;

import java.util.Stack;

public class Demo18Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(10);
        stack.push(20);
        stack.push(10);
        System.out.println(stack.pop()); //10
        System.out.println(stack.pop());//20
        System.out.println(stack.pop());//10
        System.out.println(stack.pop());//200
        System.out.println(stack.pop());//100
        System.out.println(stack.pop());//EmptyStackException
    }

}
