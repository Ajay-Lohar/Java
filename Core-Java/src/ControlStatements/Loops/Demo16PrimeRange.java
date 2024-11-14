package ControlStatements.Loops;

public class Demo16PrimeRange {
    public static void main(String[] args) {
     //1 to 100  all  prime numbers
        for (int number=1 ;number<=100;number++){
            boolean isPrime = true;
            for (int i=2;i<=number/2;i++){
                if (number%i==0){
                    isPrime=false;
                    break;

                }
            }
            if(isPrime){
                System.out.println(number);
            }
        }
    }
}
