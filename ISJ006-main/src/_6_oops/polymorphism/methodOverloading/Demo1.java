package _6_oops.polymorphism.methodOverloading;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add("abc", "xyz"));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30, 40));
        System.out.println(add(10.40f, 20.45f));
    }

    private static String add(String str1, String str2) {
        return str1 + str2;
    }

    private static float add(float number1, float number2) {
        return number1 + number2;
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    private static int add(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}
