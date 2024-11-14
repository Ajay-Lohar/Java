package ControlStatements.Loops;

public class Demo15Prime {
    public static void main(String[] args) {
        int number =7 ;
        boolean isPrime=true;

        for (int i =2 ;i<=number/2;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("prime number " + number);
        }else{
            System.out.println(" Not a prime number " + number);
        }

    }
}
