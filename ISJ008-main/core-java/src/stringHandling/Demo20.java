package stringHandling;

public class Demo20 {
    public static void main(String[] args) {
        //converting String, StringBuilder, StringBuffer
        String str1 = "good morning";
        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuffer stringBuffer = new StringBuffer(str1);
        System.out.println(str1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        String str2 = new String(stringBuilder);
        System.out.println("string builder to string : "+str2);
    }
}
