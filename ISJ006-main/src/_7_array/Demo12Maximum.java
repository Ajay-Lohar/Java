package _7_array;

public class Demo12Maximum {
    public static void main(String[] args) {
        int[] array = {190, 76, 87, 54, 98, 99, 36, 192};
        int maximum = -2147483648;
        for (int index = 0; index < array.length; index++) {
            if (maximum < array[index]) {
                maximum = array[index];
            }
        }
        System.out.println("Array Maximum element is " + maximum);

    }
}
