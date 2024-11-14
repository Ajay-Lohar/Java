package ControlStatements.Whileloop;

public class Demo2Reverse {
    public static void main(String[] args) {
            int number = 123456789;
            int sum = 0;

            while (number>0){
                int digit = number % 10 ;
                sum= sum *10 + digit;
                number = number/10;
            }
            System.out.println("Reveerse  Of Given Number " + sum);

    }
}
