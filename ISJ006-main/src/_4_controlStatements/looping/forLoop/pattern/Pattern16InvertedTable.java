package _4_controlStatements.looping.forLoop.pattern;

public class Pattern16InvertedTable {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int row = numberOfRows; row >= 1; row--) {
            //space
            for (int space = 1; space <= numberOfRows - row; space++) {
                System.out.print(" ");
            }

            //stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
