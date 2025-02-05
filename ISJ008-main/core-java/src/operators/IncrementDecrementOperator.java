package operators;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + --c + d++ + c++ + b++);//15
        System.out.println("a value is " + a);//2
        System.out.println("b value is " + b);//4
        System.out.println("c value is " + c);//3
        System.out.println("d value is " + d);//5
    }
}
