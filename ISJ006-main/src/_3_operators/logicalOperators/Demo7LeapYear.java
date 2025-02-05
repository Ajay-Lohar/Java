package _3_operators.logicalOperators;

public class Demo7LeapYear {
    public static void main(String[] args) {
        //Leap year :
        // year which is divisible by 4
        // and if it is century then it must be divisible by 400
        int year = 2023;//2100
        System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

        );
    }
}
