package misc.wrapperClasses;

public class Demo3 {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        float floatValue = integer.floatValue();//integer to float
        byte byteValue = integer.byteValue();//integer to byte
        short shortValue = integer.shortValue();//integer to short
        double doubleValue = integer.doubleValue();//integer to double
        long longValue = integer.longValue();//integer to long value
        System.out.println("float value " + floatValue);
        System.out.println("byte value " + byteValue);
        System.out.println("short value " + shortValue);
        System.out.println("double value " + doubleValue);
        System.out.println("long value " + longValue);
    }
}
