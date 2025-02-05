package _8_exceptionHandling;

import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int otp =  rand.nextInt(9999);
        System.out.print("otp is " + otp);
    }
}
