package StringHandling;

public class Demo4Methods {
    public static void main(String[] args) {
        String courses ="java ,python,react";

        String[] splitstring = courses.split(",");

        for(String split : splitstring){
            System.out.println(split);
        }
        String str = "         ";
        String str2 = null;
        //blank : Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println("Is String blank : " + str.isBlank());


        //length==0 --> true else false
        System.out.println("Is String empty : " + str.isEmpty());

        //search
        System.out.println(courses.contains("Java"));//true

        String str7 = "Abc";
        System.out.println(str7.codePointAt(0));//65

        System.out.println("character array");
        char[] charArray = str7.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            System.out.print(charArray[index] + " ");
        }

    }
}
