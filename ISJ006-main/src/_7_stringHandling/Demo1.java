package _7_stringHandling;

public class Demo1 {
    public static void main(String[] args) {
        // char[] array = {'a', 'b', 'c', 'd'};
        char[] array = {'A', 'B', 'C', 'D'};
        System.out.println("Is empty " + isEmpty(array));
        for (char ch : array) {
            System.out.print(ch);
        }
    }

    private static boolean isEmpty(char[] array) {
        return array.length == 0;
    }

    private static void toLowerCase(char[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'A' && array[index] < 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
    }

    private static void toUpperCase(char[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'a' && array[index] <= 'z') {
                array[index] = (char) (array[index] - 32);
            }
        }
    }
}
