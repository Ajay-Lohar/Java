package _4_controlStatements.looping.whileLoop;

public class Demo6 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "\t" + right);
        }
        //0 5
        //0 5
        //0 5
        //...........infinite loop
    }
}
