package _7_array;

public class Demo15ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 45, 34, 67, 89};
       /* for (int index = array.length-1; index >=0 ; index--) {
            System.out.print(array[index]+" ");
        }*/
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
