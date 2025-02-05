package controlStatements.loopingStatements.whileLoop;

public class Demo5 {
    public static void main(String[] args) {
        int slow = 0;
        int fast = 0;
        while (slow <= fast) {
            System.out.println(slow + "\t" + fast);
            slow++;
            fast = fast + 2;
        }
    }
}
