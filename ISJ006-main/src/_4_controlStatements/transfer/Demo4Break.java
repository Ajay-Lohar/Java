package _4_controlStatements.transfer;

public class Demo4Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 11 == 0) {
                break;
            }
        }
    }
}
