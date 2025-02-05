package _3_operators.bitwiseOperators;

public class Demo4BitwiseRightShift {
    public static void main(String[] args) {
        System.out.println(4 >> 1);//4 / 2^1 ==> 2
        System.out.println(4 >> 2);//4 / 2 ^2 --> 1
        System.out.println(4 >> 3);// 4 / 2 ^ 3--> 0
        System.out.println(4 >> 4);// 4 / 2 ^ 3 --> 0
    }
}
