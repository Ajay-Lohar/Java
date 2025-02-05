package array;

public class Demo12SecondMaximumElement {
    public static void main(String[] args) {
        int[] array = {4500, 31, 450, 500};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element > max) {
                secondMax = max;
                max = element;
            }
            if (element > secondMax && element < max) {
                secondMax = element;
            }

        }
        System.out.println("Max element is " + max);
        System.out.println("Second Max element is " + secondMax);
    }
}
