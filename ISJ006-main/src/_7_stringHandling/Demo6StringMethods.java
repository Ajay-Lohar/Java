package _7_stringHandling;

public class Demo6StringMethods {
    public static void main(String[] args) {
        String str = "string handling session";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(22));
        for (int index = 0; index < str.length(); index++) {
            System.out.print(str.charAt(index));
        }
        System.out.println("is string empty " + str.isEmpty());

        System.out.println(str.contains("string12"));

        System.out.println(str.startsWith("q"));

        System.out.println(str.endsWith("q"));

    }
}
