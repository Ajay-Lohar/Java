package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern6 {
    /*
        1
        1 0
        1 0 1
        1 0 1 0
        1 0 1 0 1

    * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column % 2 != 0 ? 1+" " : 0+" ");
            }
            System.out.println();
        }

    }
}
