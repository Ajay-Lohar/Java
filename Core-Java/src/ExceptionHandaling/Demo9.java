package ExceptionHandaling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (Exception exception) {
            System.out.println("generic exception handler");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");

        /*
        Output:
        1. 10
        2. 4
        3. invalid index
        4. finally block
        5. rest of the main

        * */
    }
}
