package _4_controlStatements.looping;

public class Question {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static class Demo1 {
        public static void main(String[] args) {
            int count = 1;
            for (int row = 1; row <= 5; row = row + 2) {
                for (int space = 5 - row; space > 0; space--) {
                    System.out.print(" ");
                }

                for (int star = 1; star <= row; star++) {
                    if (count == star) {
                        System.out.print(count+" ");
                    } else {
                        System.out.print("* ");
                    }
                }
                count++;
                System.out.println();
            }
        }
    }
}
/*
* 0
10
210
3210
43210
*
* */