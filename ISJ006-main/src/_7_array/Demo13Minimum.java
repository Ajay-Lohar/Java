package _7_array;

public class Demo13Minimum {
    public static void main(String[] args) {
        int[] array = {190, 76, 87, 54, 98, 99, 36, 192};
        int minimum = 2147483647;
        for (int index = 0; index < array.length; index++) {
            if (minimum > array[index]) {
                minimum = array[index];
            }
        }
        System.out.println("Array Minimum element is " + minimum);

    }
}
