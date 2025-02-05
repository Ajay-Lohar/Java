package misc.wrapperClasses;

public class Demo2 {
    public static void main(String[] args) {
        Byte byteValue = new Byte("123");
        System.out.println(byteValue);

        short shortValue = byteValue.shortValue();
        int integerValue = byteValue.intValue();
        long longValue = byteValue.longValue();
        float floatValue = byteValue.floatValue();
        double doubleValue = byteValue.doubleValue();
        String byteValueString = byteValue.toString();

        //parsing --> converting string into primitive type
        byte parsedByte = Byte.parseByte("123");

        Byte byteWrappedValue = Byte.valueOf("123");
    }
}
