package _4_controlStatements.looping.forLoop;

public class Demo9 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;

        for (; left < right; ) {
            System.out.println(left + "\t" + right);
        }
        //output=
        // 0 10
        // ........
    }
}
