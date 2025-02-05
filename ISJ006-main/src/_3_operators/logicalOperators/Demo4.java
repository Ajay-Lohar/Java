package _3_operators.logicalOperators;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 % 3 == 0 && 10 / 0 == 0);//false
        System.out.println(10 / 0 == 0 && 10 % 3 == 0);//exception
    }
}
