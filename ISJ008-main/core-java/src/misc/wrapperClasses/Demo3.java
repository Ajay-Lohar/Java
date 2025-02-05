package misc.wrapperClasses;

public class Demo3 {
    public static void main(String[] args) {
        int intValue = 127;
        System.out.println("Binary : "+Integer.toBinaryString(intValue));
        System.out.println("Octal : "+Integer.toOctalString(intValue));
        System.out.println("Hexa decimal : "+Integer.toHexString(intValue));
    }
}
