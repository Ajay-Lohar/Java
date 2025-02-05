package misc;

public class EllipsisOperator {
    public static void main(String[] args) {
        //ellipsis -> ...
        System.out.println(add(10, 20, 30, 40));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }

    public static int add(int... input) {
        int addition = 0;
        for (int temp : input) {
            addition += temp;
        }
        return addition;
    }
}
