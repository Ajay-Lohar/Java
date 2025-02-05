package _7_stringHandling;

public class Demo16Conversion {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = "abc";
//        StringBuffer stringBuffer = "abc";
        String str = "abc";
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);

        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);

        System.out.println(str2);
        System.out.println(str3);
    }

}
