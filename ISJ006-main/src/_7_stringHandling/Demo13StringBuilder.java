package _7_stringHandling;

public class Demo13StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append(" added at the end");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
