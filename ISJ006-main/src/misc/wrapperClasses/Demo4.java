package misc.wrapperClasses;

public class Demo4 {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        int reversed = Integer.reverse(123445);
        System.out.println("Reverse " + reversed);
        String string = integer.toString();
        System.out.println("integer to String " + string);
    }
}
