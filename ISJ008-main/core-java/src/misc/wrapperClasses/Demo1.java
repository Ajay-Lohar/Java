package misc.wrapperClasses;

public class Demo1 {
    public static void main(String[] args) {
        byte b1 = 100;
        Byte byteValue = b1;//auto-boxing
        byte b2 = byteValue; //auto-unboxing

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(byteValue);
    }
}
