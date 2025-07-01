package ControlStatements.Whileloop;

public class Demo4Palindrome {
    public static void main(String[] args) {
        int number =131;
        int originalNumber =number;
        int reverse =0 ;
        while (number>0){
            int digit=number % 10 ;
            reverse = reverse * 10 + digit;
            number =number/10;

        }
        if (reverse==originalNumber){
            System.out.println("Palindrome Number ");
        }else {
            System.out.println("Not a Palindrome Number");
        }


    }
//hi2
}
