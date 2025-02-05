package _7_array;

public class Demo9SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 450};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        System.out.println("Array elements sum = "+sum);

    }
}
