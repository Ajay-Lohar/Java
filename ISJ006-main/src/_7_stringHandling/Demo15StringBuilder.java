package _7_stringHandling;

public class Demo15StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("string handling using StringBuilder");
//        stringBuilder.deleteCharAt(0);
        stringBuilder.delete(0, 6);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"String Operations");
        System.out.println(stringBuilder);

    }
}
