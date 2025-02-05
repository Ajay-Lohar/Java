package exceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        System.out.println(getNumber());//3
    }

    private static int getNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
