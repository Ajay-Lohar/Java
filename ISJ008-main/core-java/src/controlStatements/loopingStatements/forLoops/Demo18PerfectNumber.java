package controlStatements.loopingStatements.forLoops;

public class Demo18PerfectNumber {
    public static void main(String[] args) {
        int number = 14;
        int sum = 0;
        System.out.println("Factor of " + number+"are ..");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("Sum of factors is " + sum);
        System.out.println(sum==number?"Perfect":"not a perfect");
    }
}
