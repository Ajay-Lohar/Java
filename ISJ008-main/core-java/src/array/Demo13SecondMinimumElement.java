package array;

public class Demo13SecondMinimumElement {
    public static void main(String[] args) {
        int[] array = {4500, 31, 450, 500};
        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element < minimum) {
                secondMin = minimum;
                minimum = element;
            }
            if (element < secondMin && element > minimum) {
                secondMin = element;
            }

        }
        System.out.println("Min element is " + minimum);
        System.out.println("Second Min element is " + secondMin);
    }
}
