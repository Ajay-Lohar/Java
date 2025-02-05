package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern10 {
    /*
       1 2 3 4 5
       1 2 3 4
       1 2 3
       1 2
       1

    * */
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
