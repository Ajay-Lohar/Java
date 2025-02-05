package _3_operators.logicalOperators;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10 > 3 || 10 > 5);//true
        System.out.println(10 > 3 || 10 > 11);//true

        System.out.println(10 % 2 == 0 || 10 % 5 == 0);//true
        System.out.println(10 % 2 == 0 || 10 % 3 == 0);//false
    }
}
