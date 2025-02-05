package inputAccept;

import java.util.Scanner;

public class Demo12LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeapYear ? "its leap year" : "not a leap year");
    }
}
