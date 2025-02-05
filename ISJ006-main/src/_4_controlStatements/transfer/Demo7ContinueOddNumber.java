package _4_controlStatements.transfer;

public class Demo7ContinueOddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        //continue;//CTE
    }
}
