package _4_controlStatements.looping.forLoop;

public class Demo10 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;

        for (; left < right; left++) {
            System.out.println(left + "\t" + right);
        }
        //output=
        // 0 10
        // 1 10
        // 2 10
        // 3 10
        // 4 10
        // 5 10
        // 6 10
        // 7 10
        // 8 10
        // 9 10

    }
}
