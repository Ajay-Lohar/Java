package Operators;

public class Demo7 {
    //ternary Operator
    public static void main(String[] args) {
//     System.out.println(4>3?"4 Is greter ":"3 is Greter ");

// Write a code of  given 3 numbers which is biggest
        int Num1 = 100;
        int Num2 = 200;
        int Num3 = 300;
        System.out.println(
                (Num1>Num2 && Num1>Num3)
                        ? Num1
                        :(Num2>Num1 && Num2>Num3 ?Num2 :Num3)

        );
    }
}
