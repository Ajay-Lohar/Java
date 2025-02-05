package array;

public class Demo9LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 21, 31, 40, 50};
        int element = 31;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                System.out.println("element found at index " + index);
                break;
            }
        }
    }
}
