package interviewPrep;

public class Demo23 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 5 - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
