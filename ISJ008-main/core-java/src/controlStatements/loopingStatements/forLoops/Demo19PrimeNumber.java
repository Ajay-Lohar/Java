package controlStatements.loopingStatements.forLoops;

public class Demo19PrimeNumber {
    public static void main(String[] args) {
        int number = 12;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Its prime" : "not a prime");
    }
}
