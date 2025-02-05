package _7_array;

public class Demo14SecondMax {
    public static void main(String[] args) {
        int[] array = {76, 87, 54, 98, 99, 96, 105, 101};
        int max = -2147483648;
        int secondMax = -2147483647;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                secondMax = max;
                max = array[index];
            } else if (secondMax < max && secondMax < array[index]) {
                secondMax = array[index];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Second Max " + secondMax);


    }
}
