package _4_controlStatements.looping.whileLoop;


public class Demo13PalindromeNumberRange {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int originalNumber = number;
            int reverseNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reverseNumber = reverseNumber * 10 + digit;
                number = number / 10;
            }
            if (reverseNumber == originalNumber) {
                System.out.println("Palindrome " + originalNumber + "\t Reverse \t" + reverseNumber);
            }
        }

    }
}
