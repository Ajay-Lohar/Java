package operators;

public class LogicalOrOperation {
    public static void main(String[] args) {
        System.out.println(4 > 3 || 4 < 2);//true
        System.out.println(4 % 2 == 0 || 4 % 3 == 0);//true

        System.out.println(true || 10 % 0 == 0);//short circuit operator - true
        System.out.println(false && 10 % 0 == 0);//short circuit operator - false
        System.out.println(false || 10 % 0 == 0);//exception AE
    }
}
