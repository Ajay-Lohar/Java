package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
       int[][] array = new int[Integer.MAX_VALUE][Integer.MAX_VALUE];
        for (int index = 0; index < array.length; index++) {
            array[index] = new int[Integer.MAX_VALUE];
            //OutOfMemoryError
        }
    }
}
