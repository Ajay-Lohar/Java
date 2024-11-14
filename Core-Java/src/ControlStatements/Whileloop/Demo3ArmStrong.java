package ControlStatements.Whileloop;

public class Demo3ArmStrong {

    public static void main(String[] args) {
        int number = 153;  //(1^3 + 5^3 + 3^3)= 1 + 125 +27 =153
        int orgnumber=number;
        int sum =0;
        while (number>0){
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number/10;

        }

        System.out.println(orgnumber==sum ?" Given Numebr Is Armstrong ":" Not A Armstrong Number");
    }
}
