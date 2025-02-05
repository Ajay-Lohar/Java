package _4_controlStatements.transfer;

public class Demo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (!(i % 7 == 0 && i % 11 == 0)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
