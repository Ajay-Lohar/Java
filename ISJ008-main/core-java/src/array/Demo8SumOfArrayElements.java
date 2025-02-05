package array;

public class Demo8SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 21, 31, 40, 50};

        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        System.out.println("Sum of array elements  is " + sum);

    }
}
