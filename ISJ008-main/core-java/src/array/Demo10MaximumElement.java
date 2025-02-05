package array;

public class Demo10MaximumElement {
    public static void main(String[] args) {
        int[] array = {4500, 21, 31, 450, 500};
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("Max element is " + max);
    }
}
