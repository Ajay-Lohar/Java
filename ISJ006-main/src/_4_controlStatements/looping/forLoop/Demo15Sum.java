package _4_controlStatements.looping.forLoop;

public class Demo15Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
            sum += i;
        }
        System.out.println("Sum of 1 to 100 is " +sum);
    }
}
