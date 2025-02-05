package _7_array;

public class Demo24AnonymousArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 50, 60};
        printArray(array);
        printArray(new int[]{10, 20, 50, 60});//anonymous array
    }

    private static void printArray(int[] array) {
        for (int temp : array) {
            System.out.println(temp);
        }

    }
}
