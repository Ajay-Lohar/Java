package oops.polymorphism.methodOverloading;

public class Demo4 {

    public static void main(String[] args) {
        System.out.println(add(100, 200));
        System.out.println(add(100, 200, 300));
    }

    private final static int add(int number1, int number2) {
        return number1 + number2;
    }

    private final static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }


}
