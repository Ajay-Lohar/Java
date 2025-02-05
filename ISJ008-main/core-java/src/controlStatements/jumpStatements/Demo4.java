package controlStatements.jumpStatements;

public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
