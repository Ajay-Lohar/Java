package controlStatements.loopingStatements.whileLoop;

public class Demo8 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
    }
}
