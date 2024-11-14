package Operators;

public class Demo6 {
    public static void main(String[] args) {
        int base = 7;
        int exponent = 5;
        int result = 1;

        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
