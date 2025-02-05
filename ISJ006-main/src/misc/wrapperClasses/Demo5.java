package misc.wrapperClasses;

public class Demo5 {
    public static void main(String[] args) {
        //valueOf
        Integer integer = Integer.valueOf("123");//string or primitive and convert into integer wrapper
        int primitiveInteger = Integer.parseInt("123");// string to primitive
        System.out.println(primitiveInteger);

        float parsedFloat = Float.parseFloat("123");
        System.out.println(parsedFloat);

        boolean parseBoolean = Boolean.parseBoolean("true");
        System.out.println(parseBoolean);
    }
}
