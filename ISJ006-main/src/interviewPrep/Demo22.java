package interviewPrep;

public class Demo22 {
    public static void main(String[] args) {
        int count = 1;
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
