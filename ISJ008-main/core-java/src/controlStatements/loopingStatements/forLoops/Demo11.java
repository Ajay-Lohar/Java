package controlStatements.loopingStatements.forLoops;

public class Demo11 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; left++) {
            System.out.println(left + "\t" + right);
        }
        // 0 10
        // ....
        // 9 10
        // iterations = 10
    }
}
