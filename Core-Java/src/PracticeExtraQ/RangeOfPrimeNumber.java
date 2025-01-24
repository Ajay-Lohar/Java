package PracticeExtraQ;

public class RangeOfPrimeNumber {
    public static void main(String[] args) {
        int count = 0;

        for (int number =1 ; number < 100 ; number++){
            boolean isPrime = true;

            for (int i = 2; i <=number/2 ; i++) {

                if (number % i == 0) {
                isPrime = false;
                 break;
                }
            }
            if (isPrime) {

                System.out.println("\t" +number);
                count   = count + 1;
            }
        }
        System.out.println(" number of counts : " + count);


    }
}
