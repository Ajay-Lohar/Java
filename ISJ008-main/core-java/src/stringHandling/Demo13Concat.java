package stringHandling;

public class Demo13Concat {
    public static void main(String[] args) {
        String str = "IT Shaala";
        str = str.concat(" is a modern high tech IT training solutions provider school");
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);

        System.out.println(str.startsWith("i"));
        System.out.println(str.endsWith("school"));
        System.out.println(str.indexOf("modern"));
        System.out.println("ASCII value or UNICODE value"+str.codePointAt(0));

    }
}
