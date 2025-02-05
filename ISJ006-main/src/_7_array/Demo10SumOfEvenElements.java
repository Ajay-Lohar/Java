package _7_array;

public class Demo10SumOfEvenElements {
    public static void main(String[] args) {
        int[] array = {10, 21, 31, 12, 17};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                sum = sum + array[index];
            }
        }
        System.out.println("Array even elements sum = " + sum);

    }
}
