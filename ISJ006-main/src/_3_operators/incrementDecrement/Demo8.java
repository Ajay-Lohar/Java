package _3_operators.incrementDecrement;

public class Demo8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int p = ++a;//2
        int q = b++;//2
        int r = --c;//2
        int s = d--;//4

        System.out.println(a + b + c + d);//10
        System.out.println(p + q + r + s);//10

    }
}
