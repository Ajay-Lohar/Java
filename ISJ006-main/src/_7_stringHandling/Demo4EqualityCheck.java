package _7_stringHandling;

public class Demo4EqualityCheck {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = "abc";

        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println(str2 == str3);//true
        System.out.println(str2.equals(str3));//true
    }
}
