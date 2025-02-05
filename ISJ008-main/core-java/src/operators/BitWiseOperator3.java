package operators;

public class BitWiseOperator3 {
    public static void main(String[] args) {
        System.out.println("Left shift");
        System.out.println(4 << 1); //8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(12 << 3);//96

        System.out.println("Right shift");
        System.out.println(4 >> 1); //2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        System.out.println(12 >> 3);//1

        System.out.println("Negation");
        System.out.println(~4); //-5
        System.out.println(~-5);//4
        System.out.println(~-50);//49


    }
}
