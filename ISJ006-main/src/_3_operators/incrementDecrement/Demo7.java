package _3_operators.incrementDecrement;

public class Demo7 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        System.out.println(--a + b++ + a++ + --b + c++ + ++b + --c);//461
        System.out.println(a);//65 --> A
        System.out.println(b);//67 --> C
        System.out.println(c);//67-->C
    }
}
