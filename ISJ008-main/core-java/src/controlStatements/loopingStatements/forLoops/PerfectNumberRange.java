package controlStatements.loopingStatements.forLoops;

public class PerfectNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 100000; number++) {
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("Perfect number " + number);
            }
        }
    }
}
