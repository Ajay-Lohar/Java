package controlStatements.loopingStatements.forLoops.patterns;

public class Pattern2 {
    /*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    n stars
    * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            //stars
            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
