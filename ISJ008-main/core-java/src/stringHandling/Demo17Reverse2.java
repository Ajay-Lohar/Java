package stringHandling;

public class Demo17Reverse2 {
    public static void main(String[] args) {
        String str = "good morning";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
