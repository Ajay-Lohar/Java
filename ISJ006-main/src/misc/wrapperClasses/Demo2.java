package misc.wrapperClasses;

public class Demo2 {
    public static void main(String[] args) {
        int i = 10;
        Integer integer = new Integer(i);
        System.out.println(integer);
        float floatValue = 100.30f;
        Integer integer2 = new Integer("100");
        System.out.println(integer2 + 200);

        System.out.println("Binary conversion " + Integer.toBinaryString(100));
        System.out.println("Octal conversion " + Integer.toOctalString(100));
        System.out.println("Hexa Decimal conversion " + Integer.toHexString(100));
    }
}
