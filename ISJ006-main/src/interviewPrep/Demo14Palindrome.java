package interviewPrep;

public class Demo14Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        int originalNumber = number;
        //0*10 + 3
        //3*10 + 2 = 32
        //32*10 + 1 =321
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + reverse);
        System.out.println(originalNumber == reverse ? "palindrome" : "not a palindrome");


    }
}
