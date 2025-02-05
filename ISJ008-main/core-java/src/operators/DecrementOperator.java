package operators;

public class DecrementOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = --a;
        System.out.println("a value is " + a);//4
        System.out.println("b value is " + b);//4

        int x = 5;
        int y = x--;
        System.out.println("x value is " + x);//4
        System.out.println("y value is " + y);//5


    }
}
