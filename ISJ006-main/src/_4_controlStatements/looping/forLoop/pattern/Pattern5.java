package _4_controlStatements.looping.forLoop.pattern;

public class Pattern5 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        for (int row = 1; row <= 50; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
