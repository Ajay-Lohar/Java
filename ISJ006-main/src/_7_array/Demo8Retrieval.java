package _7_array;

public class Demo8Retrieval {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 450};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        System.out.println("using for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
