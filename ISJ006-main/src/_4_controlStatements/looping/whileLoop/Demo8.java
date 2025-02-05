package _4_controlStatements.looping.whileLoop;

public class Demo8 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "       " + right);
            left++;
            right--;
        }
        //0 5
        //1 4
        //2 3
    }
}
