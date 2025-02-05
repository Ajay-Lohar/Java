package array;

public class Demo7EvenElements {
    public static void main(String[] args) {
        int[] array = {10, 21, 31, 40, 50};

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }
}
