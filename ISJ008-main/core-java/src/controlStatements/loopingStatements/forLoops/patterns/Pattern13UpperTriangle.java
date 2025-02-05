package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern13UpperTriangle {
    /*

        *
      *  *
     * *  *
    * * *  *
   * * * *  *

    * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {

            for (int space = 5-row; space >=1 ; space--) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
