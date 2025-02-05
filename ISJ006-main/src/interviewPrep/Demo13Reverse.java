package interviewPrep;

public class Demo13Reverse {
    public static void main(String[] args) {
        int number = 123456789;
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


    }
}
