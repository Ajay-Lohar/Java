package _3_operators.incrementDecrement;

public class Demo6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(--a + b++ + a++ + --b + c++ + ++b + --c);//13
        System.out.println(a);//1
        System.out.println(b);//3
        System.out.println(c);//3
    }
}
