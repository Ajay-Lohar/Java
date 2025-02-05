package _4_controlStatements.looping.forLoop.pattern;

public class Pattern12 {
    public static void main(String[] args) {
      //*****
      // ****
      //  ***
      //   **
      //    *

        int numberOfRows = 5;
        for (int row = 5; row >= 1; row--) {
            for (int space = 1; space <=numberOfRows-row ; space++) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
