package controlStatements.loopingStatements.forLoops;

public class Demo17FactorSum {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        System.out.println("Factor of " + number+"are ..");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("Sum of factos is " + sum);
    }
}
