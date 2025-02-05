package misc;

public class AnonymousArray {
    public static void main(String[] args) {
        int[] array = {10, 30, 40, 60};
        print(new int[]{11, 22, 33, 44, 55});//anonymous array
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
