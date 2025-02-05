package stringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String str = "IT Shaala";
        System.out.println("length of the string "+str.length());
        String str2 = "            welcome to IT Shaala      ";
        str2= str2.trim();
        System.out.println(str2);
    }
}
