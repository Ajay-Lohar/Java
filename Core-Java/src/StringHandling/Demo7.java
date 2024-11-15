package StringHandling;

public class Demo7 {
    public static void main(String[] args) {
        String str ="Ajay";

        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuffer stringBuffer = new StringBuffer(str);

        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        String str1 = new String(stringBuilder);
        String str2 = new String(stringBuffer);

        System.out.println(str1);
        System.out.println(str2);
    }
}
