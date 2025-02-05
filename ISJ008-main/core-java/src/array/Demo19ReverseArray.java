package array;

public class Demo19ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 15};
        // this is not array reverse
       /* for (int index = array.length - 1; index >= 0; index--) {
            System.out.println(array[index]);
        }*/
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
