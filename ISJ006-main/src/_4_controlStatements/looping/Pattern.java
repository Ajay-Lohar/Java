package _4_controlStatements.looping;

public class Pattern {
    public static void main(String[] args) {
        int totalStars = 7;
        for (int row = 1; row <= 4; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= totalStars; column++) {
                System.out.print(column % 2 == 0 ? "0 " : "1 ");
            }
            System.out.println();
            totalStars = totalStars - 2;
        }
    }
}
