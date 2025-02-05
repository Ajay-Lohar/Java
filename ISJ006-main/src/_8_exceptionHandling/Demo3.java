package _8_exceptionHandling;

public class Demo3 {
    static int i = 1;

    public static void main(String[] args) {
        for (i = 0; i < 10;) {
            i++;
            main(null);
        }
        System.out.printf("rest of the main");
    }


}
