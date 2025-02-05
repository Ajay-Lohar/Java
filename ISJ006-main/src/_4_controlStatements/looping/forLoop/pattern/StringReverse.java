package _4_controlStatements.looping.forLoop.pattern;

public class StringReverse {
    public static void main(String[] args) {
        String str = "welcome to it shaala";
       //way 1: stringbuilder reverse method
        /* StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());*/

        //way 2:
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = str.length()-1; index >=0 ; index--) {
            stringBuilder.append(str.charAt(index));
        }
        System.out.println(stringBuilder);

    }
}
