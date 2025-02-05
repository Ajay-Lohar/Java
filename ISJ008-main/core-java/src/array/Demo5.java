package array;

public class Demo5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        array[2] = 45;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
