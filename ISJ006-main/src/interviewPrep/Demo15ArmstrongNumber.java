package interviewPrep;

public class Demo15ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int oldNumber = number;
        System.out.println(number % 10);//9
        System.out.println(number / 10);//12345678
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3); //sum = sum + digit;
            number /= 10;
        }
        System.out.println("sum of cube of digits " + sum);
        System.out.println(sum == oldNumber ? "Armstrong" : "Not a armstrong");

    }
}
