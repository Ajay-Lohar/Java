package _3_operators.logicalOperators;

public class Demo6 {
    public static void main(String[] args) {
        int number = 56;
        System.out.println(number % 5 == 0);//false

        int year = 2020;
        System.out.println(year % 400 == 0);//false

        System.out.println(year % 4 == 0);//true

        System.out.println(year % 100 != 0);//true

        System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));//true

        //false || (true && true )
        //false || true
        //false || true
        //true
    }
}
