package _3_operators.assignmentOperator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 5 * 4;
        int c = b;
        int d = add(10, 20);
        System.out.println(a);//30
        System.out.println(b);//20
        System.out.println(c);//20
        System.out.println(d);//30
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
