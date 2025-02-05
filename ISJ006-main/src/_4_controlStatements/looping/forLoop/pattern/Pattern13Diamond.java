package _4_controlStatements.looping.forLoop.pattern;

public class Pattern13Diamond {
    public static void main(String[] args) {
        //   *
        //  * *
        // * * *
        //  * *
        //   *
        //upper triangle
        for (int row = 1; row <= 5; row++) {
            for (int space = 5 - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower triangle
        for (int row = 4; row >= 1; row--) {
            //space
            for (int space = 4 - row; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int star = row; star >= 1; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
