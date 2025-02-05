package inputAccept;

import java.util.Scanner;

public class Demo1 {
    //accept
    //except
    //expect
    //aspect

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of type byte");
        byte byteInput = scanner.nextByte();
        System.out.println("Byte value entered is " + byteInput);
    }


}
