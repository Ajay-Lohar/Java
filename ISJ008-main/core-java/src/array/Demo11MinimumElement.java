package array;

public class Demo11MinimumElement {
    public static void main(String[] args) {
        int[] array = {4500, 21, 21, 31, 450, 500};
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        System.out.println("Min element is " + min);
    }
}
