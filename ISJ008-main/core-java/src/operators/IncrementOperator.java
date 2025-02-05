package operators;

public class IncrementOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        System.out.println("a value is " + a);//6
        System.out.println("b value is " + b);//6

        int x = 5;
        int y = x++;
        System.out.println("x value is " + x);//6
        System.out.println("y value is " + y);//5

        int m = 5;
        int n = 4;
        int o = ++m + n++ + --m + ++n + m++;
        System.out.println("m value is " + m);//6
        System.out.println("n value is " + n);//6
        System.out.println("o value is " + o);//26
    }
}
