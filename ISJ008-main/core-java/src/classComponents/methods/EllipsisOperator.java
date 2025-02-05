package classComponents.methods;

public class EllipsisOperator {
    public static int add(int... numbers) {
        int result = 0;

        for (int temp : numbers) {
            result = result + temp;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(100, 200));
        System.out.println(add(100, 200, 300));
        System.out.println(add(100, 200, 300, 500));
        System.out.println(add(100, 200, 300, 500, 600));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
