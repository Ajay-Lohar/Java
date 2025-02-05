package _4_controlStatements.looping.whileLoop;

public class Demo14PerfectNumberRange {
    public static void main(String[] args) {
        //perfect number : given number = sum of its factors

        for (int number = 1; number <= 10000; number++) {
            long sumOfFactors = 0;
            for (long i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("Perfect " + number);
            }
        }
    }
}
