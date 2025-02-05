package stringHandling;

public class Demo18 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//true
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.compareTo(str2));//0
        System.out.println(str1.compareToIgnoreCase(str2));//0

        System.out.println("A".compareTo("B"));//-1
        System.out.println("B".compareTo("A"));//1


    }
}
