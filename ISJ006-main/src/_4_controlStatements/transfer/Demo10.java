package _4_controlStatements.transfer;

public class Demo10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("rest of the main method");
    }
    // 1,2,3,4, 6,7,8,9,10
    //rest of the main
}
