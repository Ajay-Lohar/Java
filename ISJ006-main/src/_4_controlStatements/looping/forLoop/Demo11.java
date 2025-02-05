package _4_controlStatements.looping.forLoop;

public class Demo11 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;

        for (; left < right; left++, right--) {
            System.out.println(left + "\t" + right);
        }
        //output=
        // 0 10
        // 1 9
        // 2 8
        // 3 7
        // 4 6

    }
}
