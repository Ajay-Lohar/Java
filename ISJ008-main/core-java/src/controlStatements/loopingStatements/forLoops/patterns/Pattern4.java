package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern4 {
    /*
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
    * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            //stars
            for (int column = 1; column <= row; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }

    }
}
