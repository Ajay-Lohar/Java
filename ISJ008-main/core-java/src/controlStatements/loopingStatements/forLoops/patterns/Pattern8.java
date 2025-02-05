package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern8 {
    /*
          1
       1 2
     1 2 3
   1 2 3 4

    * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            //spaces
            for (int space = 5 - row; space > 0; space--) {
                System.out.print(" ");
            }

            //value
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
