package controlStatements.loopingStatements.forLoops;

public class Demo16 {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Factor of " + number+"are ..");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
