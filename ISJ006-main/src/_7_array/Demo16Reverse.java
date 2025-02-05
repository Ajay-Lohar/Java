package _7_array;

public class Demo16Reverse {
    public static void main(String[] args) {
        int[] array = {87, 98, 12, 34, 56, 76};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
