package interviewPrep;

public class Demo12DigitSum {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(number % 10);//9
        System.out.println(number / 10);//12345678
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; //sum = sum + digit;
            number /= 10;
        }
        System.out.println("sum of digits " + sum);

    }
}
