package stringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "xyz";
        String str4 = "xyz";
        String str5 = new String("xyz");
        System.out.println(str1 == str2);//false ---> reference address
        System.out.println(str1.equals(str2));//true --> content

        System.out.println(str3 == str4);//true
        System.out.println(str3 == str5);//false

        System.out.println("equals method");
        System.out.println(str3.equals(str5));//true --> content check
    }
}
