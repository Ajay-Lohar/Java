package _3_operators.incrementDecrement;

public class Demo5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a++ + ++b + --c);//6
        System.out.println(a++ + ++b + --c);//2 + 4 + 1--> 7
        System.out.println(a++ + ++b + --c);//3 + 5 + 0--> 8
        System.out.println(a++ + ++b + --c);//4 + 6 + -1--> 9
    }
}
