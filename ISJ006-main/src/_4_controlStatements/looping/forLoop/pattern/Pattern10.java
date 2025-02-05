package _4_controlStatements.looping.forLoop.pattern;

public class Pattern10 {
    public static void main(String[] args) {
        //    *
        //   **
        //  ***
        // ****
        //*****
        int numberOfRows = 50;
        for (int row = 1; row <= numberOfRows; row++) {
            //space
            for (int space = numberOfRows - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
