package _10_collectionFramework.list.stackImpl;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        String str = "{[}]";//valid parenthesis
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
            }
        }

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '}':
                    stack.pop();
                    break;
                case ']':
                    stack.pop();
                    break;
                case ')':
                    stack.pop();
                    break;
            }
        }
        System.out.println(stack.isEmpty() ? "valid" : "invalid");
    }
}
