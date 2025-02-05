package _4_controlStatements.looping.forLoop;

public class Demo25Pattern {
    public static void main(String[] args) {
        /*
         *   * * * *
         *   * * * *
         *   * * * *
         *   * * * *
         *
         * */
        for (int row = 1; row <= 40; row++) {
            for (int column = 1; column <= 40; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
