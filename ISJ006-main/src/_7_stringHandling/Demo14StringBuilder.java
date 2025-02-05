package _7_stringHandling;

public class Demo14StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
       stringBuilder.replace(0,stringBuilder.length()-1,"xyz");
        System.out.println(stringBuilder);

    }
}
