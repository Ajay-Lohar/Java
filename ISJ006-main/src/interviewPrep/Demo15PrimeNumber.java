package interviewPrep;

public class Demo15PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "its prime number" : "not a prime");
    }
}
