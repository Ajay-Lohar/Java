package _3_operators.arithmeticOperators;

public class Demo6 {
    public static void main(String[] args) {
        int number = 3647;
        System.out.println(number % 10);//7
       // number = number / 10;
        number /=10;


        System.out.println(number % 10);//4
        number = number / 10;

        System.out.println(number % 10);//6
        number = number / 10;

        System.out.println(number % 10);//3
        number = number / 10;

    }
}
