package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern11 {
    /*
        5 5 5 5 5
        4 4 4 4
        3 3 3
        2 2
        1

    * */
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
