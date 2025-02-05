package _4_controlStatements.looping.forLoop;

public class Demo8 {
    public static void main(String[] args) {
        for (int i = 0, j = 5; i < j; i++, j--) {
            System.out.println(i + "\t" + j);
        }
        //output :
        // 0 5
        // 1 4
        // 2 3

    }
}
