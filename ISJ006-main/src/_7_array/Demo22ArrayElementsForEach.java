package _7_array;

public class Demo22ArrayElementsForEach {
    public static void main(String[] args) {
        int[] array = {10, 20, 56, 87, 90};

        System.out.println("traditional for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }

        System.out.println("\nEnhanced for loop or foreach");
        for (int temp : array) {
            System.out.print(temp + " ");
        }

    }
}
