package operators.arithmetic;

public class ShortHandArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 10;
        a += 10; // short hand arithmetic operators --
        System.out.println(a);//20

        int b = 10;
        //b = b - 5; //5
        b -= 5; //5
        System.out.println("b value " + b);

        int c = 15;
        //c = c * 2;//30
        c *= 2;//30
        System.out.println("C value is " + c);

        int d = 10;
        //d = d / 2;//5
        d /= 2;//5
        System.out.println("d value is " + d);

        int e = 10;
        //e = e % 3;//1
        e %= 3;//1
        System.out.println("e value is " + e);

    }
}
