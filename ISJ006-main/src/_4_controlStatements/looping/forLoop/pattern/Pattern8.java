package _4_controlStatements.looping.forLoop.pattern;

public class Pattern8 {
    public static void main(String[] args) {
        // 1
        // 0 0
        // 1 1 1
        // 0 0 0 0
        // 1 1 1 1 1
        for (int row = 1; row <= 50; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row % 2 == 0 ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}
