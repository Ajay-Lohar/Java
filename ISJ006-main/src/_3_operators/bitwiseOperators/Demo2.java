package _3_operators.bitwiseOperators;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("bitwise AND operation");
//        System.out.println(4 && 5);//CTE --> Logical AND -> expected i/p: boolean
        System.out.println(4 & 5);// Bitwise AND operation --> 4
        System.out.println(4 | 5);// Bitwise OR operation --> 5
        System.out.println(4 ^ 5);// Bitwise XOR operation --> 1
    }
}
