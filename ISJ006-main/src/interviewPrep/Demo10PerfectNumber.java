package interviewPrep;

public class Demo10PerfectNumber {
    public static void main(String[] args) {
        int number = 100;
        //factors
        //Perfect number : given number = sum of its factor
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor " + i);
                sumOfFactors += i;
            }
        }
        System.out.println(sumOfFactors == number ? "perfect" : "not a perfect number");


    }
}
