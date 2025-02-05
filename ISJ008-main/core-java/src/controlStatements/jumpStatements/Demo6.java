package controlStatements.jumpStatements;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
        // output : 1 to 49
    }
}
